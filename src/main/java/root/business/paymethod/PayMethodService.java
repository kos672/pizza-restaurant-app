package root.business.paymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entities.PayMethod;

import java.util.List;

@Service
public class PayMethodService {

    @Autowired
    private PayMethodRepository repository;

    public List<PayMethod> getAllPayMethods() {
        return repository.findAll();
    }

    public PayMethod getPayMethodByName(String name) {
        return repository.findByName(name);
    }
}
