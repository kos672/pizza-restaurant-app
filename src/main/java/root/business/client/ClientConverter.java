package root.business.client;

import org.springframework.stereotype.Component;
import root.entities.Client;

import java.util.Optional;

@Component
public class ClientConverter {

    public ClientDto convert(Client entity) {
        return ClientDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .phoneNumber(entity.getPhoneNumber())
                .idAddress(Optional.ofNullable(entity.getAddress()).map(address -> address.getId()).orElse(null))
                .build();
    }

}
