package root.business.paymethod;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;

@Component
public class PayMethodDtoToVOConverter extends AbstractDtoToVOConverter<PayMethodDto, PayMethodVO> {
    @Override
    public PayMethodVO convert(PayMethodDto dto) {
        PayMethodVO vo = new PayMethodVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setPurchases(dto.getPurchases());
        return vo;
    }
}
