package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.entities.PayMethod;

@CrossOrigin
@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<Void> createPurchase(@RequestBody PayMethod payMethod) {
        purchaseService.createPurchase(payMethod);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
