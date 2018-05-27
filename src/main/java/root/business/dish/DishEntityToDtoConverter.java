package root.business.dish;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.Dish;
import root.entities.Ingredient;

import java.util.stream.Collectors;

@Component
public class DishEntityToDtoConverter extends AbstractEntityToDtoConverter<Dish, DishDto> {
    @Override
    public DishDto convert(Dish entity) {
        return DishDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .imagePath(entity.getImagePath())
                .description(entity.getDescription())
                .purchases(entity.getPurchases().stream().map(purchaseDish -> purchaseDish.getPurchase().getId())
                        .collect(Collectors.toList()))
                .ingredients(entity.getIngredients().stream().map(Ingredient::getId).collect
                        (Collectors.toList()))
                .build();
    }
}
