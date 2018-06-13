package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;
import root.business.ingredient.IngredientDtoToVOConverter;
import root.business.ingredient.IngredientService;

import static java.util.stream.Collectors.toList;


@Component
public class DishDtoToVOConverter extends AbstractDtoToVOConverter<DishDto, DishVO> {

    private IngredientDtoToVOConverter ingredientDtoToVOConverter;
    private IngredientService ingredientService;

    @Autowired
    public DishDtoToVOConverter(IngredientDtoToVOConverter ingredientDtoToVOConverter, IngredientService
            ingredientService) {
        this.ingredientDtoToVOConverter = ingredientDtoToVOConverter;
        this.ingredientService = ingredientService;
    }

    @Override
    public DishVO convert(DishDto dto) {
        DishVO vo = new DishVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setPrice(dto.getPrice());
        vo.setImagePath(dto.getImagePath());
        vo.setDescription(dto.getDescription());
        vo.setIngredients(dto.getIngredients().stream().map(integer -> this.ingredientService.getIngredientById
                (integer)).map(ingredientDtoToVOConverter::convert).collect(toList()));
        vo.setCategory(dto.getCategory());
        return vo;
    }
}