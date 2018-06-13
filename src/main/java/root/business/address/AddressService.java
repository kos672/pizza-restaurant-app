package root.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.Address;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;
    private AddressEntityToDtoConverter addressEntityToDtoConverter;

    @Autowired
    public AddressService(AddressRepository addressRepository, AddressEntityToDtoConverter
            addressEntityToDtoConverter) {
        this.addressRepository = addressRepository;
        this.addressEntityToDtoConverter = addressEntityToDtoConverter;
    }

    public Address findAddressByCityAndStreet(String city, String street) {
        return addressRepository.findByCityAndStreet(city, street);
    }

    public List<AddressDto> getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        return addressEntityToDtoConverter.convertAll(addresses);
    }

}
