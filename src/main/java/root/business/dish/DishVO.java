package root.business.dish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DishVO implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private double price;

    @JsonProperty("imagePath")
    private String imagePath;

    @JsonProperty("description")
    private String description;

    @JsonProperty("purchases")
    private List<Integer> purchases;

    @JsonProperty("ingredients")
    private List<Integer> ingredients;

    @JsonProperty("categoryId")
    private int category;

}
