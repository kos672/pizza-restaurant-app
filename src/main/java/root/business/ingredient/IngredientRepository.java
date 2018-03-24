package root.business.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

    Ingredient getIngredientByName(String name);

}
