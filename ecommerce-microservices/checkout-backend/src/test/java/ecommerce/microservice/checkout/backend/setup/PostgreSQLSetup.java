package ecommerce.microservice.checkout.backend.setup;

import org.springframework.boot.test.context.TestConfiguration;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.wait.strategy.Wait;

@TestConfiguration
public class PostgreSQLSetup {

    @SuppressWarnings("rawtypes")
    private static final PostgreSQLContainer postgreContainer = new PostgreSQLContainer()
            .withDatabaseName("ecommerce")
                    .withUsername("checkout")
                    .withPassword("checkout");

    static {
        postgreContainer.start();
        postgreContainer.waitingFor(Wait.forHealthcheck());
        System.setProperty("spring.datasource.url", postgreContainer.getJdbcUrl());
    }
}
