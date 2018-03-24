package root.business.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import root.entities.Drink;

import java.util.List;

@RestController
public class DrinkController {

    @Autowired
    private DrinkService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrinks() {
        List<Drink> drinks = service.getAllDrinks();
        return drinks.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(drinks,
                HttpStatus.OK);
    }

    @GetMapping("/drinks/{name}")
    public ResponseEntity<Drink> getDrinkByName(@PathVariable String name) {
        Drink drink = service.findDrinkByName(name);
        return drink == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(drink, HttpStatus.OK);
    }
}
