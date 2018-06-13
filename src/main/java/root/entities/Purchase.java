package root.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
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
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Integer id;

    @Column(name = "time_purchase")
    private LocalDateTime purchaseTime;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "house_nr", nullable = false)
    private String houseNumber;

    @Column(name = "flat_nr")
    private int flatNumber;

    @ManyToOne
    @JoinColumn(name = "id_pay_method")
    private PayMethod payMethod;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "purchase_drink",
            joinColumns = @JoinColumn(name = "id_purchase"),
            inverseJoinColumns = @JoinColumn(name = "id_drink"))
    private List<Drink> drinks;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "purchase_dish",
            joinColumns = @JoinColumn(name = "id_purchase"),
            inverseJoinColumns = @JoinColumn(name = "id_dish"))
    private List<Dish> dishes;
}
