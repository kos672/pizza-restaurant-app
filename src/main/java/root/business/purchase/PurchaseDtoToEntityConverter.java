package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToEntityConverter;
import root.business.address.AddressDto;
import root.business.address.AddressService;
import root.business.paymethod.PayMethodRepository;
import root.entities.Purchase;

@Component
public class PurchaseDtoToEntityConverter extends AbstractDtoToEntityConverter<PurchaseDto, Purchase> {

    private AddressService addressService;
    private PayMethodRepository payMethodRepository;

    @Autowired
    public PurchaseDtoToEntityConverter(AddressService addressService, PayMethodRepository payMethodRepository) {
        this.addressService = addressService;
        this.payMethodRepository = payMethodRepository;
    }

    @Override
    public Purchase convert(PurchaseDto dto) {
        Purchase entity = new Purchase();
        AddressDto addressDto = dto.getAddress();
        entity.setPurchaseTime(dto.getPurchaseTime());
        entity.setNotes(dto.getNotes());
        entity.setAddress(this.addressService.findAddressByCityAndStreet(addressDto.getCity(), addressDto.getStreet()));
        entity.setHouseNumber(dto.getHouseNumber());
        entity.setFlatNumber(dto.getFlatNumber());
        entity.setPayMethod(this.payMethodRepository.findOne(dto.getPayMethod()));
        entity.setDrinks(dto.getDrinks());
        entity.setDishes(dto.getDishes());
        return entity;
    }

}
