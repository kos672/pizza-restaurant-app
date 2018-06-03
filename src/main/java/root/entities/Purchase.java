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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
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
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Integer id;

    @Column(name = "time_purchase")
    private Time purchaseTime;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "house_nr", nullable = false)
    private String houseNumber;

    @Column(name = "flat_nr", nullable = false)
    private int flatNumber;

    @ManyToOne()
    @JoinColumn(name = "id_pay_method")
    private PayMethod payMethod;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseDrink> drink;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseDish> dishes;
}
