package root.business.dish;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import root.business.ingredient.IngredientDto;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DishDto {

    private Integer id;
    private String name;
    private double price;
    private String imagePath;
    private String description;
    private List<IngredientDto> ingredients;
    private int category;

}
