package root.business.paymethod;

import org.junit.Test;
import root.business.abstracts.AbstractRepositoryIntTest;
import root.entities.PayMethod;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class PayMethodRepositoryIntTest extends AbstractRepositoryIntTest<PayMethodRepository> {

    @Test
    public void shouldFindAllPayMethods() {
        // given
        List<PayMethod> payMethods = asList(
                new PayMethod(null, "card", null),
                new PayMethod(null, "cash", null),
                new PayMethod(null, "online", null)
        );
        persistCollectionAndFlush(payMethods);

        // when
        List<PayMethod> foundPayMethods = repository.findAll();

        // then
        assertThat(foundPayMethods, is(not(emptyList())));
        assertThat(foundPayMethods, hasSize(3));
    }
}