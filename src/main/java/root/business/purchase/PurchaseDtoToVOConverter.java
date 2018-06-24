package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;
import root.business.address.AddressDtoToVOConverter;
import root.entities.Dish;
import root.entities.Drink;

import java.util.stream.Collectors;

@Component
public class PurchaseDtoToVOConverter extends AbstractDtoToVOConverter<PurchaseDto, PurchaseVO> {

    @Autowired
    private AddressDtoToVOConverter addressDtoToVOConverter;

    @Override
    public PurchaseVO convert(PurchaseDto dto) {
        PurchaseVO vo = new PurchaseVO();
        vo.setId(dto.getId());
        vo.setPurchaseTime(dto.getPurchaseTime().toString());
        vo.setNotes(dto.getNotes());
        vo.setAddress(addressDtoToVOConverter.convert(dto.getAddress()));
        vo.setHouseNumber(dto.getHouseNumber());
        vo.setFlatNumber(dto.getFlatNumber());
        vo.setPayMethod(dto.getPayMethod());
        vo.setDrinks(dto.getDrinks().stream().map(Drink::getId).collect(Collectors.toList()));
        vo.setDishes(dto.getDishes().stream().map(Dish::getId).collect(Collectors.toList()));
        return vo;
    }
}
