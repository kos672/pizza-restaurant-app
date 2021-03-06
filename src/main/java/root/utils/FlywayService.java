package root.utils;

import org.flywaydb.core.Flyway;

/**
 * Class is istended for clean db schema
 */
public class FlywayService {

    private FlywayService() {
    }

    public static void main(String[] args) {
        prepareFlyway().clean();
        prepareFlyway().migrate();
    }

    private static Flyway prepareFlyway() {
        Flyway flyway = new Flyway();
        //flyway.setDataSource("jdbc:mysql://localhost:3306/pizza_rest?useSSL=false", "root", "root");
        flyway.setDataSource("jdbc:mysql://www.db4free.net:3306/pizza_rest?useSSL=false", "pizza_rest_admin",
                "pizzarest");
        return flyway;
    }

}
