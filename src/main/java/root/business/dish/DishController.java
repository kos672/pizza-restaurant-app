package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/dishes")
public class DishController {

    private DishService dishService;
    private DishDtoToVOConverter dishDtoToVOConverter;

    @Autowired
    public DishController(DishService dishService, DishDtoToVOConverter dishDtoToVOConverter) {
        this.dishService = dishService;
        this.dishDtoToVOConverter = dishDtoToVOConverter;
    }


    @GetMapping
    public ResponseEntity<List<DishVO>> getAllDishes() {
        List<DishDto> dishesDto = dishService.getAllDishes();
        List<DishVO> dishesVO = dishDtoToVOConverter.convertAll(dishesDto);
        return dishesDto.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new
                ResponseEntity<>(dishesVO, HttpStatus.OK);
    }

}
