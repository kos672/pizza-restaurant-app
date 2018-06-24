package root.business.purchase.export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;
import root.business.address.AddressDtoToVOConverter;
import root.business.dish.DishDtoToVOConverter;
import root.business.drink.DrinkDtoToVOConverter;

@Component
public class PurchaseExportDtoToVOConverter extends AbstractDtoToVOConverter<PurchaseExportDto, PurchaseExportVO> {

    private AddressDtoToVOConverter addressDtoToVOConverter;
    private DrinkDtoToVOConverter drinkDtoToVOConverter;
    private DishDtoToVOConverter dishDtoToVOConverter;

    @Autowired
    public PurchaseExportDtoToVOConverter(AddressDtoToVOConverter addressDtoToVOConverter, DrinkDtoToVOConverter
            drinkDtoToVOConverter, DishDtoToVOConverter dishDtoToVOConverter) {
        this.addressDtoToVOConverter = addressDtoToVOConverter;
        this.drinkDtoToVOConverter = drinkDtoToVOConverter;
        this.dishDtoToVOConverter = dishDtoToVOConverter;
    }

    @Override
    public PurchaseExportVO convert(PurchaseExportDto dto) {
        PurchaseExportVO vo = new PurchaseExportVO();
        vo.setId(dto.getId());
        vo.setPurchaseTime(dto.getPurchaseTime().toString());
        vo.setNotes(dto.getNotes());
        vo.setAddress(addressDtoToVOConverter.convert(dto.getAddress()));
        vo.setHouseNumber(dto.getHouseNumber());
        vo.setFlatNumber(dto.getFlatNumber());
        vo.setPayMethod(dto.getPayMethod());
        vo.setDrinks(drinkDtoToVOConverter.convertAll(dto.getDrinks()));
        vo.setDishes(dishDtoToVOConverter.convertAll(dto.getDishes()));
        return vo;
    }
}