package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Dish;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepository repository;

    public List<Dish> getAllDishes() {
        return repository.findAll();
    }

    public Dish getDishByName(String name) {
        return repository.getByName(name);
    }

}
