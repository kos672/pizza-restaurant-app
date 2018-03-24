package root.business.paymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import root.entities.PayMethod;

import java.util.List;

@CrossOrigin
@RestController
public class PayMethodController {

    @Autowired
    private PayMethodService service;

    @GetMapping("/pay-methods")
    public ResponseEntity<List<PayMethod>> getAllPayMethods() {
        List<PayMethod> payMethods = service.getAllPayMethods();
        return payMethods.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(payMethods,
                HttpStatus.OK);
    }

    @GetMapping("/pay-methods/{name}")
    public ResponseEntity<PayMethod> getPayMethodByName(@RequestParam String name) {
        PayMethod payMethod = service.getPayMethodByName(name);
        return payMethod == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(payMethod,
                HttpStatus.OK);
    }

}
