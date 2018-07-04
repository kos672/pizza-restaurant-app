package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;
import root.business.ingredient.IngredientDtoToVOConverter;

import java.util.stream.Collectors;


@Component
public class DishDtoToVOConverter extends AbstractDtoToVOConverter<DishDto, DishVO> {

    @Autowired
    private IngredientDtoToVOConverter ingredientDtoToVOConverter;

    @Override
    public DishVO convert(DishDto dto) {
        DishVO vo = new DishVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setPrice(dto.getPrice());
        vo.setImagePath(dto.getImagePath());
        vo.setDescription(dto.getDescription());
        vo.setIngredients(dto.getIngredients().stream().map(ingredientDtoToVOConverter::convert).collect(Collectors
                .toList()));
        vo.setCategory(dto.getCategory());
        return vo;
    }
}