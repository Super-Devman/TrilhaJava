package ecommerce.microservice.checkout.backend.listener;

import ecommerce.microservice.checkout.backend.entity.CheckoutEntity;
import ecommerce.microservice.checkout.backend.service.CheckoutService;
import ecommerce.microservice.checkout.backend.streaming.PaymentConfirmSink;
import ecommerce.microservice.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentConfirmListener {

    private CheckoutService checkoutService;

    @StreamListener(PaymentConfirmSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(),
                CheckoutEntity.Status.APPROVED);
    }
}
