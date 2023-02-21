package ecommerce.microservice.payment.api.service.impl;

import ecommerce.microservice.checkout.backend.event.CheckoutCreatedEvent;
import ecommerce.microservice.payment.api.entity.PaymentEntity;
import ecommerce.microservice.payment.api.repository.PaymentRepository;
import ecommerce.microservice.payment.api.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent) {
        final PaymentEntity paymentEntity = PaymentEntity.builder()
                .checkoutCode(checkoutCreatedEvent.getCheckoutCode())
                .code(UUID.randomUUID().toString())
                .build();
        paymentRepository.save(paymentEntity);
        return Optional.of(paymentEntity);
    }
}
