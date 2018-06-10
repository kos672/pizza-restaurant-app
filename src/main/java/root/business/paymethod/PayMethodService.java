package root.business.paymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.PayMethod;

import java.util.List;

@Service
public class PayMethodService {

    private PayMethodRepository payMethodRepository;
    private PayMethodEntityToDtoConverter payMethodEntityToDtoConverter;

    @Autowired
    public PayMethodService(PayMethodRepository payMethodRepository, PayMethodEntityToDtoConverter
            payMethodEntityToDtoConverter) {
        this.payMethodRepository = payMethodRepository;
        this.payMethodEntityToDtoConverter = payMethodEntityToDtoConverter;
    }

    public List<PayMethodDto> getAllPayMethods() {
        List<PayMethod> payMethods = payMethodRepository.findAll();
        return this.payMethodEntityToDtoConverter.convertAll(payMethods);
    }

}
