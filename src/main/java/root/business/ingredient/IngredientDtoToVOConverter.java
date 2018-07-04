package root.business.ingredient;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;

@Component
public class IngredientDtoToVOConverter extends AbstractDtoToVOConverter<IngredientDto, IngredientVO> {
    @Override
    public IngredientVO convert(IngredientDto dto) {
        IngredientVO vo = new IngredientVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        return vo;
    }
}
