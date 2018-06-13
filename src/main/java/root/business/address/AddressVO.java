package root.business.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressVO implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("city")
    private String city;

    @JsonProperty("street")
    private String street;

}
