package root.business.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import root.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
