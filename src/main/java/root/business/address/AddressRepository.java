package root.business.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import root.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address getAddressByCityAndStreetAndAndHouseNumberAndFlatNumber(String city, String street, String houseNumber, int
            flatNumber);

    @Query(value = "SELECT MAX(id_address) FROM address", nativeQuery = true)
    int getLastStoredAddress();

}
