package root.business.paymethod;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.PayMethod;

import java.util.stream.Collectors;

@Component
public class PayMethodEntityToDtoConverter extends AbstractEntityToDtoConverter<PayMethod, PayMethodDto> {
    @Override
    public PayMethodDto convert(PayMethod entity) {
        return PayMethodDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .purchases(entity.getPurchases().stream().map(purchase -> purchase.getId()).collect
                        (Collectors.toList()))
                .build();
    }
}
