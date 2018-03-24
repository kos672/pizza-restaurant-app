package root.business.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Drink;

import java.util.List;

@Service
public class DrinkService {

    @Autowired
    private DrinkRepository repository;

    public List<Drink> getAllDrinks() {
        return repository.findAll();
    }

    public Drink findDrinkByName(String name) {
        return repository.findByName(name);
    }
}
