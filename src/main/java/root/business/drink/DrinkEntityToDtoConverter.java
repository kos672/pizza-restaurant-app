package root.business.drink;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.Drink;

@Component
public class DrinkEntityToDtoConverter extends AbstractEntityToDtoConverter<Drink, DrinkDto> {
    @Override
    public DrinkDto convert(Drink entity) {
        return DrinkDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .build();
    }
}
