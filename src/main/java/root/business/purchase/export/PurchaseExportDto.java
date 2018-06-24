package root.business.purchase.export;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import root.business.address.AddressDto;
import root.business.dish.DishDto;
import root.business.drink.DrinkDto;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseExportDto {

    private Integer id;
    private LocalDateTime purchaseTime;
    private String notes;
    private AddressDto address;
    private String houseNumber;
    private int flatNumber;
    private String payMethod;
    private List<DrinkDto> drinks;
    private List<DishDto> dishes;


}
