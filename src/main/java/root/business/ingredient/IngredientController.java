package root.business.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import root.entities.Ingredient;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ingredients")
    public ResponseEntity<List<Ingredient>> getAllIngredients() {
        List<Ingredient> allIngredients = service.getAllIngredients();
        return allIngredients.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>
                (allIngredients, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ingredients/{name}")
    public ResponseEntity<Ingredient> getIngredientByName(@PathVariable String name) {
        Ingredient ingredient = service.getIngredientByName(name);
        return ingredient == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(ingredient, HttpStatus.OK);
    }

}
