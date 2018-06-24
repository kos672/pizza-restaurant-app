package root.business.purchase.export;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import root.business.address.AddressVO;
import root.business.dish.DishVO;
import root.business.drink.DrinkVO;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseExportVO implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("time")
    private String purchaseTime;

    @JsonProperty("notes")
    private String notes;

    @JsonProperty("address")
    private AddressVO address;

    @JsonProperty("houseNumber")
    private String houseNumber;

    @JsonProperty("flatNumber")
    private int flatNumber;

    @JsonProperty("payMethod")
    private String payMethod;

    @JsonProperty("drinks")
    private List<DrinkVO> drinks;

    @JsonProperty("dishes")
    private List<DishVO> dishes;

}
