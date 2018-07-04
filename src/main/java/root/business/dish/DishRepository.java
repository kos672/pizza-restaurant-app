package root.business.dish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import root.entities.Dish;

import java.util.Set;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

    @Query("select d from Dish d join fetch d.ingredients")
    public Set<Dish> getDishesWithIngredients();

}
