package ecommerce.microservice.payment.api.service;

import ecommerce.microservice.checkout.backend.event.CheckoutCreatedEvent;
import ecommerce.microservice.payment.api.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
