package root.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Time;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Integer id;

    @Column(name = "nr_purchase", nullable = false)
    private int purchaseNumber;

    @Column(name = "extra_cheese")
    private boolean extraCheese;

    @Column(name = "time_purchase")
    private Time purchaseTime;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_address")
    private Address address;

    @ManyToOne()
    @JoinColumn(name = "id_pay_method")
    private PayMethod payMethod;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseDrink> drink;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseDish> dishes;

    @ManyToMany
    @JoinTable(name = "purchase_ingredient",
            joinColumns = @JoinColumn(name = "id_purchase", referencedColumnName = "id_purchase"),
            inverseJoinColumns = @JoinColumn(name = "id_ingredient", referencedColumnName =
                    "id_ingredient"))
    private List<Ingredient> ingredients;
}
