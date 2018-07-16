package root.business.abstracts;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AbstractRepositoryIntTest<T extends JpaRepository> {

    @Autowired
    protected T repository;

    @Autowired
    protected TestEntityManager em;

    /**
     * Method persists list of objects and flushes context
     *
     * @param entities
     */
    protected void persistCollectionAndFlush(List<?> entities) {
        entities.stream().forEach(o -> em.persist(o));
        em.flush();
    }

}
