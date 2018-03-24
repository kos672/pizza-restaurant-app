package root.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.entities.Address;

@CrossOrigin
@RestController
public class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping("/addresses/{city}/{house}/{flat}")
    public ResponseEntity<Address> getAddressByCityAndAndHouseNumberAndFlatNumber(@PathVariable(name = "city") String
                                                                                          city,
                                                                                  @PathVariable(name = "street")
                                                                                          String street,
                                                                                  @PathVariable(name = "house")
                                                                                          String houseNumber,
                                                                                  @PathVariable(name = "flat") int
                                                                                          flatNumber) {
        Address address = service.getAddressByCityAndStreetAndHouseNumberAndFlatNumber(city, street,
                houseNumber, flatNumber);
        return address == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(address,
                HttpStatus.OK);
    }

    // + return Id when it object is already stored in DB
    @PostMapping("/addresses")
    public ResponseEntity<Integer> postAddress(@RequestBody Address address) {
        service.saveAddress(address);
        return new ResponseEntity<>(address.getId(), HttpStatus.OK);
    }
}
