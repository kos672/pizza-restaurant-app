package root.business.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DrinkController {

    private DrinkService drinkService;
    private DrinkDtoToVOConverter drinkDtoToVOConverter;

    @Autowired
    public DrinkController(DrinkService drinkService, DrinkDtoToVOConverter drinkDtoToVOConverter) {
        this.drinkService = drinkService;
        this.drinkDtoToVOConverter = drinkDtoToVOConverter;
    }

    @GetMapping("/drinks")
    public ResponseEntity<List<DrinkVO>> getAllDrinks() {
        List<DrinkDto> drinksDto = drinkService.getAllDrinks();
        List<DrinkVO> drinksVO = drinkDtoToVOConverter.convertAll(drinksDto);
        return drinksDto.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(drinksVO,
                HttpStatus.OK);
    }
}
