package root.business.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import root.entities.Client;

import javax.transaction.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {AppConfig.class})
@Transactional
@Rollback
@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository repository;

    @Test
    public void shouldFindClientByName() {
        // given
        Client client = new Client();
        //Address address = new Address(1, "Warsaw", "32", 5, null, null);
        client.setName("Ben");
        //client.setAddress(address);
        //client.setAddress();

        // when
        repository.save(client);

        // then
        assertThat(repository.getClientByName("Ben").getName(), equalTo(client.getName()));
    }
}
