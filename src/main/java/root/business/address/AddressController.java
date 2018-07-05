package root.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AddressController {

    private AddressService addressService;
    private AddressDtoToVOConverter addressDtoToVOConverter;

    @Autowired
    public AddressController(AddressService addressService, AddressDtoToVOConverter addressDtoToVOConverter) {
        this.addressService = addressService;
        this.addressDtoToVOConverter = addressDtoToVOConverter;
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressVO>> getAllAddresses() {
        List<AddressDto> addressDtos = addressService.getAllAddresses();
        List<AddressVO> addressVOs = addressDtoToVOConverter.convertAll(addressDtos);
        return addressDtos.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(addressVOs,
                HttpStatus.OK);
    }

}
