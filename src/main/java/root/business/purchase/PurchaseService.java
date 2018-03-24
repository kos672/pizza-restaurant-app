package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import root.business.address.AddressService;
import root.entities.PayMethod;
import root.entities.Purchase;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PurchaseService {

    private PurchaseRepository repository;
    private AddressService addressService;

    @Autowired
    public PurchaseService(PurchaseRepository repository, AddressService addressService) {
        this.repository = repository;
        this.addressService = addressService;
    }

    @Transactional
    public void createPurchase(PayMethod payMethod) {
        Date currentdate = new Date();
        int month = Integer.valueOf(new SimpleDateFormat("MM").format(currentdate));
        int day = Integer.valueOf(new SimpleDateFormat("dd").format(currentdate));
        int year = Integer.valueOf(new SimpleDateFormat("yyyy").format(currentdate));
        Double purchaseNr = month * year / day * Math.random() * day / month;
        Purchase purchase = new Purchase();
        purchase.setPurchaseNumber(purchaseNr.intValue());
        purchase.setPayMethod(payMethod);
        purchase.setAddress(addressService.getLastAddress());
    }


}
