package root.business.drink;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrinkDto {

    private Integer id;
    private String name;
    private double price;
    private List<Integer> purchases;

}
