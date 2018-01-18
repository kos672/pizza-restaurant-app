package root.entities;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "purchase_dish")
public class PurchaseDish implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_purchase")
    private Purchase purchase;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_dish")
    private Dish dish;

    @Column(name = "count_dish")
    private int count;
}
