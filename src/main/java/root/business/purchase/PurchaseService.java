package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.business.purchase.export.PurchaseExportDto;
import root.business.purchase.export.PurchaseExportEntityToDtoConverter;
import root.entities.Purchase;

import java.util.List;

@Service
public class PurchaseService {

    private PurchaseVOToDtoConverter purchaseVOToDtoConverter;
    private PurchaseDtoToEntityConverter purchaseDtoToEntityConverter;
    private PurchaseRepository purchaseRepository;
    private PurchaseExportEntityToDtoConverter purchaseExportEntityToDtoConverter;

    @Autowired
    public PurchaseService(PurchaseVOToDtoConverter purchaseVOToDtoConverter, PurchaseDtoToEntityConverter
            purchaseDtoToEntityConverter, PurchaseRepository purchaseRepository, PurchaseExportEntityToDtoConverter
                                   purchaseExportEntityToDtoConverter) {
        this.purchaseVOToDtoConverter = purchaseVOToDtoConverter;
        this.purchaseDtoToEntityConverter = purchaseDtoToEntityConverter;
        this.purchaseRepository = purchaseRepository;
        this.purchaseExportEntityToDtoConverter = purchaseExportEntityToDtoConverter;
    }

    public void createPurchase(PurchaseVO purchaseVO) {
        PurchaseDto dto = purchaseVOToDtoConverter.convert(purchaseVO);
        purchaseRepository.save(this.purchaseDtoToEntityConverter.convert(dto));
    }

    public List<PurchaseExportDto> getAllPurchases() {
        List<Purchase> purchases = purchaseRepository.findAll();
        return purchaseExportEntityToDtoConverter.convertAll(purchases);
    }

}
