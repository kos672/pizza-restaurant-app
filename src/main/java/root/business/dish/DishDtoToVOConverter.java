package root.business.dish;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;


@Component
public class DishDtoToVOConverter extends AbstractDtoToVOConverter<DishDto, DishVO> {

    @Override
    public DishVO convert(DishDto dto) {
        DishVO vo = new DishVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setPrice(dto.getPrice());
        vo.setImagePath(dto.getImagePath());
        vo.setDescription(dto.getDescription());
        vo.setPurchases(dto.getPurchases());
        vo.setIngredients(dto.getIngredients());
        vo.setCategory(dto.getCategory());
        return vo;
    }
}