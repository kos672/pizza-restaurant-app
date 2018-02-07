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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_drink", nullable = false)
    private Integer id;

    @Column(name = "name_drink", nullable = false)
    private String name;

    @Column(name = "price_drink", nullable = false)
    private double price;

    @OneToMany(mappedBy = "drink", fetch = FetchType.LAZY)
    private List<PurchaseDrink> purchase;
}
