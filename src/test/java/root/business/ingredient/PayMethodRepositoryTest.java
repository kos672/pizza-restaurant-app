package root.business.ingredient;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import root.business.paymethod.PayMethodRepository;
import root.entities.PayMethod;

import javax.transaction.Transactional;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
@SpringBootTest
public class PayMethodRepositoryTest {

    @Autowired
    private PayMethodRepository repository;

    @Before
    public void setUp() {
        List<PayMethod> repositoryAll = repository.findAll();
        repository.delete(repositoryAll);
    }

    @Test
    public void shouldFindPayMethodById() {
        // given
        PayMethod pm = new PayMethod(3, "card", null);

        // when
        repository.saveAndFlush(pm);

        // then
        assertThat(repository.findByName("card"), equalTo(pm));
    }

}
