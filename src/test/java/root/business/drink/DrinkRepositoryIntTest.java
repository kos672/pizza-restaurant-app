package root.business.drink;

import org.junit.Test;
import root.business.abstracts.AbstractRepositoryIntTest;
import root.entities.Drink;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class DrinkRepositoryIntTest extends AbstractRepositoryIntTest<DrinkRepository> {

    @Test
    public void shouldFindAllDrinks() {
        // given
        List<Drink> drinks = asList(
                new Drink(null, "vodka", 11.11),
                new Drink(null, "beer", 5.55),
                new Drink(null, "absinthe", 33.33)
        );
        persistCollectionAndFlush(drinks);

        // when
        List<Drink> foundDrinks = repository.findAll();

        // then
        assertThat(foundDrinks, is(not(emptyList())));
        assertThat(foundDrinks, hasSize(3));
    }
}