package root.business.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.business.purchase.export.PurchaseExportDto;
import root.business.purchase.export.PurchaseExportDtoToVOConverter;
import root.business.purchase.export.PurchaseExportVO;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class PurchaseController {

    private PurchaseService purchaseService;
    private PurchaseExportDtoToVOConverter purchaseExportDtoToVOConverter;

    @Autowired
    public PurchaseController(PurchaseService purchaseService, PurchaseExportDtoToVOConverter
            purchaseExportDtoToVOConverter) {
        this.purchaseService = purchaseService;
        this.purchaseExportDtoToVOConverter = purchaseExportDtoToVOConverter;
    }

    @PostMapping(value = "/purchases", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPurchase(@RequestBody PurchaseVO vo) {
        purchaseService.createPurchase(vo);
    }

    @GetMapping(value = "/purchases")
    public ResponseEntity<List<PurchaseExportVO>> getPurchases() {
        List<PurchaseExportDto> purchasesDto = purchaseService.getAllPurchases();
        List<PurchaseExportVO> purchasesVO = purchaseExportDtoToVOConverter.convertAll(purchasesDto);
        return purchasesDto.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(purchasesVO, HttpStatus.OK);
    }

}
