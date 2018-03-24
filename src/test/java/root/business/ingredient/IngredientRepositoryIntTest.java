package root.business.ingredient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import root.configuration.AppConfig;
import root.entities.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@Transactional
@Rollback
@SpringBootTest
public class IngredientRepositoryIntTest {

    @PersistenceContext
    public EntityManager entityManager;

    @Autowired
    private IngredientRepository repository;

    @Test
    public void shouldFindIngredientById() {
        // given
        Ingredient ingredient = new Ingredient();
        ingredient.setId(2);

        // when
        repository.save(ingredient);

        // then
        //assertThat(repository.findIngredientById(2), equalTo(ingredient));

    }

}
