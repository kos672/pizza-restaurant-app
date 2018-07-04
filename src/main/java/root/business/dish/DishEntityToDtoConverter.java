package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.business.ingredient.IngredientEntityToDtoConverter;
import root.entities.Dish;

import java.util.stream.Collectors;

@Component
public class DishEntityToDtoConverter extends AbstractEntityToDtoConverter<Dish, DishDto> {

    @Autowired
    private IngredientEntityToDtoConverter ingredientEntityToDtoConverter;

    @Override
    public DishDto convert(Dish entity) {
        return DishDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .imagePath(entity.getImagePath())
                .description(entity.getDescription())
                .ingredients(entity.getIngredients().stream().map(ingredientEntityToDtoConverter::convert).collect
                        (Collectors.toList()))
                .category(entity.getCategory().getId())
                .build();
    }
}
