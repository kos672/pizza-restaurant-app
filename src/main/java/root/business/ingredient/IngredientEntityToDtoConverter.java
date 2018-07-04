package root.business.ingredient;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.Ingredient;

@Component
public class IngredientEntityToDtoConverter extends AbstractEntityToDtoConverter<Ingredient, IngredientDto> {
    @Override
    public IngredientDto convert(Ingredient entity) {
        return IngredientDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
