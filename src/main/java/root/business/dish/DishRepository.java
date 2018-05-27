package root.business.dish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

}
