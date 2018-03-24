package root.business.address;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import root.configuration.AppConfig;
import root.entities.Address;

import javax.transaction.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@Transactional
@Rollback
@SpringBootTest
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository repository;

    @Test
    public void shouldFindAddressByCityAndHouseAndFlat() {
        // given
        Address address = new Address(1, "Warsaw", "3 maja", "32", 5);

        // when
        //repository.save(address);
        repository.save(address);

        // then
        assertThat(repository.getAddressByCityAndStreetAndAndHouseNumberAndFlatNumber("Warsaw", "3 maja", "32", 5)
                .getCity
                        (), equalTo
                (address.getCity()));
        assertThat(repository.getAddressByCityAndStreetAndAndHouseNumberAndFlatNumber("Warsaw", "3 maja", "32", 5)
                        .getHouseNumber(),
                equalTo
                        (address.getHouseNumber()));
        assertThat(repository.getAddressByCityAndStreetAndAndHouseNumberAndFlatNumber("Warsaw", "3 maja", "32", 5)
                .getFlatNumber(), equalTo
                (address.getFlatNumber()));

    }
}
