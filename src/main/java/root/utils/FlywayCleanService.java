package root.utils;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Service;

/**
 * Class is istended for clean db schema
 */
@Service
public class FlywayCleanService {

    private FlywayCleanService() {
    }

    private static Flyway prepareFlyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/pizza_rest?useSSL=false", "root", "root");
        return flyway;
    }

    public static void main(String[] args) {
        prepareFlyway().clean();
    }

}
