package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.business.address.AddressEntityToDtoConverter;
import root.entities.Purchase;

@Component
public class PurchaseEntityToDtoConverter extends AbstractEntityToDtoConverter<Purchase, PurchaseDto> {

    @Autowired
    private AddressEntityToDtoConverter addressEntityToDtoConverter;

    @Override
    public PurchaseDto convert(Purchase entity) {
        return PurchaseDto.builder()
                .id(entity.getId())
                .purchaseTime(entity.getPurchaseTime())
                .notes(entity.getNotes())
                .address(addressEntityToDtoConverter.convert(entity.getAddress()))
                .houseNumber(entity.getHouseNumber())
                .flatNumber(entity.getFlatNumber())
                .payMethod(entity.getPayMethod().getId())
                .drinks(entity.getDrinks())
                .dishes(entity.getDishes())
                .build();
    }
}
