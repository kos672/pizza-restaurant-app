package root.business.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
}
