package root.business.client;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClientDto {

    private int id;
    private String name;
    private int phoneNumber;
    private int idAddress;
}
