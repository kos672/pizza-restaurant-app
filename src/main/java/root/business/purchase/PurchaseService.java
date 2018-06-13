package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    private PurchaseVOToDtoConverter purchaseVOToDtoConverter;
    private PurchaseDtoToEntityConverter purchaseDtoToEntityConverter;
    private PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseVOToDtoConverter purchaseVOToDtoConverter, PurchaseDtoToEntityConverter
            purchaseDtoToEntityConverter, PurchaseRepository purchaseRepository) {
        this.purchaseVOToDtoConverter = purchaseVOToDtoConverter;
        this.purchaseDtoToEntityConverter = purchaseDtoToEntityConverter;
        this.purchaseRepository = purchaseRepository;
    }

    public void createPurchase(PurchaseVO purchaseVO) {
        PurchaseDto dto = purchaseVOToDtoConverter.convert(purchaseVO);
        purchaseRepository.save(this.purchaseDtoToEntityConverter.convert(dto));
    }

}
