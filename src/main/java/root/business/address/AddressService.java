package root.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Address;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address findAddressByCityAndStreet(String city, String street) {
        return this.addressRepository.findByCityAndStreet(city, street);
    }

}
