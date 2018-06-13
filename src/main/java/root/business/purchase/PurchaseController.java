package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping(value = "/purchases", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPurchase(@RequestBody PurchaseVO vo) {
        purchaseService.createPurchase(vo);
    }

}
