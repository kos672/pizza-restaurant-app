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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "dish")
public class Dish implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_dish", nullable = false)
    private Integer id;

    @Column(name = "name_dish", nullable = false)
    private String name;

    @Column(name = "price_dish", nullable = false)
    private double price;

    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<PurchaseDish> purchases;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "dish_ingredient",
            joinColumns = @JoinColumn(name = "id_dish", referencedColumnName = "id_dish"),
            inverseJoinColumns = @JoinColumn(name = "id_ingredient", referencedColumnName =
                    "id_ingredient"))
    private List<Ingredient> ingredients;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;
}
