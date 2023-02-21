package ecommerce.microservice.checkout.backend.streaming;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentConfirmSink {
    String INPUT = "payment-paid-input";

    @Input(INPUT)
    SubscribableChannel input();
}
