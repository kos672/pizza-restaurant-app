package root.business.purchase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import root.business.address.AddressDto;
import root.entities.Dish;
import root.entities.Drink;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDto {

    private Integer id;
    private LocalDateTime purchaseTime;
    private String notes;
    private AddressDto address;
    private String houseNumber;
    private int flatNumber;
    private Integer payMethod;
    private List<Drink> drinks;
    private List<Dish> dishes;

}
