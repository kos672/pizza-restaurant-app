package root.business.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import root.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    public Address findByCityAndStreet(String city, String street);

}
