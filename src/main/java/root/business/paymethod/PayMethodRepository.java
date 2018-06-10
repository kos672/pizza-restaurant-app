package root.business.paymethod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.PayMethod;

@Repository
public interface PayMethodRepository extends JpaRepository<PayMethod, Integer> {
}
