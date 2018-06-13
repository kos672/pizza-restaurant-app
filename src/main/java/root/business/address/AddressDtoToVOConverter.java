package root.business.address;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractDtoToVOConverter;

@Component
public class AddressDtoToVOConverter extends AbstractDtoToVOConverter<AddressDto, AddressVO> {
    @Override
    public AddressVO convert(AddressDto dto) {
        AddressVO vo = new AddressVO();
        vo.setId(dto.getId());
        vo.setCity(dto.getCity());
        vo.setStreet(dto.getStreet());
        return vo;
    }
}
