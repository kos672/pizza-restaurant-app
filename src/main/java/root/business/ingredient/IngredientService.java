package root.business.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Ingredient;

@Service
public class IngredientService {

    private IngredientRepository ingredientRepository;
    private IngredientEntityToDtoConverter ingredientEntityToDtoConverter;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository, IngredientEntityToDtoConverter
            ingredientEntityToDtoConverter) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientEntityToDtoConverter = ingredientEntityToDtoConverter;
    }

    public IngredientDto getIngredientById(int id) {
        Ingredient ingredient = this.ingredientRepository.getOne(id);
        return this.ingredientEntityToDtoConverter.convert(ingredient);
    }

}
