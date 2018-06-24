package root.business.purchase.export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.business.address.AddressEntityToDtoConverter;
import root.business.dish.DishEntityToDtoConverter;
import root.business.drink.DrinkEntityToDtoConverter;
import root.entities.Purchase;

@Component
public class PurchaseExportEntityToDtoConverter extends AbstractEntityToDtoConverter<Purchase, PurchaseExportDto> {

    private AddressEntityToDtoConverter addressEntityToDtoConverter;
    private DrinkEntityToDtoConverter drinkEntityToDtoConverter;
    private DishEntityToDtoConverter dishEntityToDtoConverter;

    @Autowired
    public PurchaseExportEntityToDtoConverter(AddressEntityToDtoConverter addressEntityToDtoConverter,
                                              DrinkEntityToDtoConverter drinkEntityToDtoConverter,
                                              DishEntityToDtoConverter dishEntityToDtoConverter) {
        this.addressEntityToDtoConverter = addressEntityToDtoConverter;
        this.drinkEntityToDtoConverter = drinkEntityToDtoConverter;
        this.dishEntityToDtoConverter = dishEntityToDtoConverter;
    }

    @Override
    public PurchaseExportDto convert(Purchase entity) {
        return PurchaseExportDto.builder()
                .id(entity.getId())
                .purchaseTime(entity.getPurchaseTime())
                .notes(entity.getNotes())
                .address(addressEntityToDtoConverter.convert(entity.getAddress()))
                .houseNumber(entity.getHouseNumber())
                .flatNumber(entity.getFlatNumber())
                .payMethod(entity.getPayMethod().getName())
                .drinks(drinkEntityToDtoConverter.convertAll(entity.getDrinks()))
                .dishes(dishEntityToDtoConverter.convertAll(entity.getDishes()))
                .build();
    }
}
