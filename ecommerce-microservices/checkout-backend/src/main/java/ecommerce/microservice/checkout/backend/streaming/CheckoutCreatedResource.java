package ecommerce.microservice.checkout.backend.streaming;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedResource {

    String OUTPUT = "checkout-created-output";

    @Output(OUTPUT)
    MessageChannel output();
}
