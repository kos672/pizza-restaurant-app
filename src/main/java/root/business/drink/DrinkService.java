package root.business.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Drink;

import java.util.List;

@Service
public class DrinkService {

    private DrinkRepository drinkRepository;
    private DrinkEntityToDtoConverter drinkEntityToDtoConverter;

    @Autowired
    public DrinkService(DrinkRepository drinkRepository, DrinkEntityToDtoConverter drinkEntityToDtoConverter) {
        this.drinkRepository = drinkRepository;
        this.drinkEntityToDtoConverter = drinkEntityToDtoConverter;
    }

    public List<DrinkDto> getAllDrinks() {
        List<Drink> drinks = this.drinkRepository.findAll();
        return this.drinkEntityToDtoConverter.convertAll(drinks);
    }
}
