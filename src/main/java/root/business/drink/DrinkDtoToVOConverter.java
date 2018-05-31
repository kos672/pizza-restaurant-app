package root.business.drink;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;

@Component
public class DrinkDtoToVOConverter extends AbstractDtoToVOConverter<DrinkDto, DrinkVO> {
    @Override
    public DrinkVO convert(DrinkDto dto) {
        DrinkVO vo = new DrinkVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setPrice(dto.getPrice());
        vo.setPurchases(dto.getPurchases());
        return vo;
    }
}
