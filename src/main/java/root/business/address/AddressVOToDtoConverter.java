package root.business.address;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractVOToDtoConverter;

@Component
public class AddressVOToDtoConverter extends AbstractVOToDtoConverter<AddressVO, AddressDto> {
    @Override
    public AddressDto convert(AddressVO vo) {
        return AddressDto.builder()
                .city(vo.getCity())
                .street(vo.getStreet())
                .build();
    }
}
