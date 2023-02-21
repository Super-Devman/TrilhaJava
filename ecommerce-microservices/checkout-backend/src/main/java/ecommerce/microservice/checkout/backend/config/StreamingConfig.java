package ecommerce.microservice.checkout.backend.config;

import ecommerce.microservice.checkout.backend.streaming.CheckoutCreatedResource;
import ecommerce.microservice.checkout.backend.streaming.PaymentConfirmSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedResource.class,
        PaymentConfirmSink.class
})
public class StreamingConfig {
}
