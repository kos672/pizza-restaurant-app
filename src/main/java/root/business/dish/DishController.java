package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import root.entities.Dish;

import java.util.List;

@RestController
public class DishController {

    @Autowired
    private DishService dishService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dishes")
    public ResponseEntity<List<Dish>> getAllDishes() {
        List<Dish> dishes = dishService.getAllDishes();
        return dishes.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new
                ResponseEntity<>(dishes, HttpStatus.OK);
    }

    @GetMapping("/dishes/{name}")
    public ResponseEntity<Dish> getDishByName(@PathVariable String name) {
        Dish dish = dishService.getDishByName(name);
        return dish == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new
                ResponseEntity<>(dish, HttpStatus.OK);
    }
}
