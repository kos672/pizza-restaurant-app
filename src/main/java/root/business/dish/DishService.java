package root.business.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Dish;

import java.util.List;

@Service
public class DishService {

    private DishRepository dishRepository;
    private DishEntityToDtoConverter dishEntityToDtoConverter;

    @Autowired
    public DishService(DishRepository dishRepository, DishEntityToDtoConverter dishEntityToDtoConverter) {
        this.dishRepository = dishRepository;
        this.dishEntityToDtoConverter = dishEntityToDtoConverter;
    }

    public List<DishDto> getAllDishes() {
        List<Dish> dishes = this.dishRepository.findAll();
        return dishEntityToDtoConverter.convertAll(dishes);
    }

}
