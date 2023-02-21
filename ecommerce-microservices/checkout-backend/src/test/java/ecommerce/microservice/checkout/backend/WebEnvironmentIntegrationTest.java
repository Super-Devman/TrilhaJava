package ecommerce.microservice.checkout.backend;

import ecommerce.microservice.checkout.backend.setup.PostgreSQLSetup;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootTest(classes = {
		CheckoutECommerceApplication.class,
		PostgreSQLSetup.class
}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWireMock(port = 8888)
public class WebEnvironmentIntegrationTest {
}
