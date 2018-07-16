package root.business.purchase;

import org.junit.Test;
import root.business.abstracts.AbstractRepositoryIntTest;
import root.entities.Address;
import root.entities.PayMethod;
import root.entities.Purchase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class PurchaseRepositoryIntTest extends AbstractRepositoryIntTest<PurchaseRepository> {
    @Test
    public void shouldFindAllPurchases() {
        // given
        Address address = new Address(null, "Moscow", "Pushkina");
        PayMethod payMethod = new PayMethod(null, "card", null);
        em.persist(address);
        em.persist(payMethod);
        List<Purchase> purchases = asList(
                new Purchase(null, LocalDateTime.of(LocalDate.of(2018, 7, 16),
                        LocalTime.of(12, 0, 0, 0)),
                        "notes", address, "35", 25, payMethod, null, null),
                new Purchase(null, LocalDateTime.of(LocalDate.of(2018, 7, 16),
                        LocalTime.of(17, 34, 22, 0)),
                        "another notes", address, "122a", 77, payMethod, null, null),
                new Purchase(null, LocalDateTime.of(LocalDate.of(2018, 7, 16),
                        LocalTime.of(7, 0, 0, 0)),
                        "noootes", address, "777", 5, payMethod, null, null)
        );
        persistCollectionAndFlush(purchases);

        // when
        List<Purchase> foundPurchases = repository.findAll();

        // then
        assertThat(foundPurchases, is(not(emptyList())));
        assertThat(foundPurchases, hasSize(3));
    }
}