package root.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue
    @Column(name = "id_ingredient")
    private Integer id;

    @Column(name = "name_ingredient")
    private String name;

    @ManyToMany(mappedBy = "ingredients", fetch = FetchType.LAZY)
    private List<Dish> dishes;

}
