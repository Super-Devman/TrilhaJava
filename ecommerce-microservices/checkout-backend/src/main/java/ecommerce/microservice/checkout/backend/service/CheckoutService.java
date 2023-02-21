package ecommerce.microservice.checkout.backend.service;

import ecommerce.microservice.checkout.backend.entity.CheckoutEntity;
import ecommerce.microservice.checkout.backend.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
