package root.business.dish;

import org.junit.Test;
import root.business.abstracts.AbstractRepositoryIntTest;
import root.entities.Category;
import root.entities.Dish;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class DishRepositoryIntTest extends AbstractRepositoryIntTest<DishRepository> {

    @Test
    public void shouldFindAllDishes() {
        // given
        Category category = new Category(null, "pizzas", null);
        em.persist(category);
        List<Dish> dishes = asList(
                new Dish(null, "pi", 10.99, "some", "some", null, category),
                new Dish(null, "pizz", 11.99, "image", "silly", null, category),
                new Dish(null, "pizza", 12.99, "path", "description", null, category)
        );
        persistCollectionAndFlush(dishes);

        // when
        List<Dish> foundDishes = repository.findAll();

        // then
        assertThat(foundDishes, is(not(emptyList())));
        assertThat(foundDishes, hasSize(3));
    }
}