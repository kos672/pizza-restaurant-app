package root.business.paymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class PayMethodController {

    private PayMethodService payMethodService;
    private PayMethodDtoToVOConverter payMethodDtoToVOConverter;

    @Autowired
    public PayMethodController(PayMethodService payMethodService, PayMethodDtoToVOConverter payMethodDtoToVOConverter) {
        this.payMethodService = payMethodService;
        this.payMethodDtoToVOConverter = payMethodDtoToVOConverter;
    }

    @GetMapping("/pay-methods")
    public ResponseEntity<List<PayMethodVO>> getAllPayMethods() {
        List<PayMethodDto> payMethodsDto = payMethodService.getAllPayMethods();
        List<PayMethodVO> payMethodsVO = payMethodDtoToVOConverter.convertAll(payMethodsDto);
        return payMethodsDto.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new
                ResponseEntity<>(payMethodsVO, HttpStatus.OK);
    }

}
