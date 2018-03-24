package root.business.drink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {

    Drink findByName(String name);
}
