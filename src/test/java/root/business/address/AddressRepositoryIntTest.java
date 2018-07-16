package root.business.address;

import org.junit.Test;
import root.business.abstracts.AbstractRepositoryIntTest;
import root.entities.Address;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddressRepositoryIntTest extends AbstractRepositoryIntTest<AddressRepository> {

    private static final String CITY = "Wroclaw";
    private static final String STREET = "Pushkina";

    @Test
    public void shouldFindAddressByCityAndStreet() {
        // given
        Address address = new Address(null, CITY, STREET);
        em.persistAndFlush(address);

        // when
        Address addressFound = repository.findByCityAndStreet(CITY, STREET);

        // then
        assertThat(addressFound.getCity(), equalTo(CITY));
        assertThat(addressFound.getStreet(), equalTo(STREET));
    }

    @Test
    public void shouldFindAllAddresses() {
        // given
        List<Address> addresses = asList(
                new Address(null, CITY, STREET),
                new Address(null, "Wroclaw", "Kwiska"),
                new Address(null, "Lodz", "Fabryczna"));
        persistCollectionAndFlush(addresses);

        // when
        List<Address> addressesFound = repository.findAll();

        // then
        assertThat(addressesFound, is(not(emptyList())));
        assertThat(addressesFound, hasSize(3));
    }
}