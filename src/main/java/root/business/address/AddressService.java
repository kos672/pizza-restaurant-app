package root.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Address;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address getAddressByCityAndStreetAndHouseNumberAndFlatNumber(String city, String street, String houseNumber,
                                                                        int flatNumber) {
        return repository.getAddressByCityAndStreetAndAndHouseNumberAndFlatNumber(city, street, houseNumber,
                flatNumber);
    }

    public void saveAddress(Address address) {
        Address alreadyExistingAddress =
                getAddressByCityAndStreetAndHouseNumberAndFlatNumber(address.getCity(), address.getStreet(), address
                        .getHouseNumber(), address.getFlatNumber());
        if (alreadyExistingAddress == null) {
            repository.save(address);
        }
    }

    public Address getLastAddress() {
        return repository.getOne(repository.getLastStoredAddress());
    }
}
