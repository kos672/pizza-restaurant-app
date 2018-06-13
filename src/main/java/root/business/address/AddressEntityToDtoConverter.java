package root.business.address;

import org.springframework.stereotype.Component;
import root.business.abstracts.AbstractEntityToDtoConverter;
import root.entities.Address;

@Component
public class AddressEntityToDtoConverter extends AbstractEntityToDtoConverter<Address, AddressDto> {

    @Override
    public AddressDto convert(Address entity) {
        return AddressDto.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .street(entity.getStreet())
                .build();
    }
}
