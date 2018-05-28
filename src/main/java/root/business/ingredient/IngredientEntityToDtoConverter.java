package root.business.ingredient;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.Dish;
import root.entities.Ingredient;

import static java.util.stream.Collectors.toList;

@Component
public class IngredientEntityToDtoConverter extends AbstractEntityToDtoConverter<Ingredient, IngredientDto> {
    @Override
    public IngredientDto convert(Ingredient entity) {
        return IngredientDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .dishes(entity.getDishes().stream().map(Dish::getId).collect(toList()))
                .build();
    }
}
