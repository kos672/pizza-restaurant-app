package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractVOToDtoConverter;
import root.business.address.AddressVOToDtoConverter;
import root.business.dish.DishRepository;
import root.business.drink.DrinkRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

import static java.util.stream.Collectors.toList;

@Component
public class PurchaseVOToDtoConverter extends AbstractVOToDtoConverter<PurchaseVO, PurchaseDto> {

    private AddressVOToDtoConverter addressVOToDtoConverter;
    private DrinkRepository drinkRepository;
    private DishRepository dishRepository;

    @Autowired
    public PurchaseVOToDtoConverter(AddressVOToDtoConverter addressVOToDtoConverter, DrinkRepository drinkRepository,
                                    DishRepository dishRepository) {
        this.addressVOToDtoConverter = addressVOToDtoConverter;
        this.drinkRepository = drinkRepository;
        this.dishRepository = dishRepository;
    }

    @Override
    public PurchaseDto convert(PurchaseVO vo) {
        return PurchaseDto.builder()
                .id(vo.getId())
                .purchaseTime(LocalDateTime.parse(vo.getPurchaseTime(), new DateTimeFormatterBuilder()
                        .parseCaseInsensitive().appendPattern("M/d/yyyy, h:mm a").toFormatter(Locale.US)))
                .notes(vo.getNotes())
                .address(this.addressVOToDtoConverter.convert(vo.getAddress()))
                .houseNumber(vo.getHouseNumber())
                .flatNumber(vo.getFlatNumber())
                .payMethod(vo.getPayMethod())
                .drinks(vo.getDrinks().stream().map(drink -> this.drinkRepository.getOne(drink)).collect(toList()))
                .dishes(vo.getDishes().stream().map(dish -> this.dishRepository.getOne(dish)).collect(toList()))
                .build();
    }
}
