package root.business.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Ingredient;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository repository;

    public List<Ingredient> getAllIngredients() {
        return repository.findAll();
    }

    public Ingredient getIngredientByName(String name) {
        return repository.getIngredientByName(name);
    }

}
