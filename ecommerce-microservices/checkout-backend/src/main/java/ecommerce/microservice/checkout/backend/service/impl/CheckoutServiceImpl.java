package ecommerce.microservice.checkout.backend.service.impl;

import ecommerce.microservice.checkout.backend.entity.CheckoutEntity;
import ecommerce.microservice.checkout.backend.entity.CheckoutItemEntity;
import ecommerce.microservice.checkout.backend.entity.ShippingEntity;
import ecommerce.microservice.checkout.backend.event.CheckoutCreatedEvent;
import ecommerce.microservice.checkout.backend.repository.CheckoutRepository;
import ecommerce.microservice.checkout.backend.resource.CheckoutRequest;
import ecommerce.microservice.checkout.backend.service.CheckoutService;
import ecommerce.microservice.checkout.backend.streaming.CheckoutCreatedResource;
import ecommerce.microservice.checkout.backend.util.IDUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedResource checkoutCreatedResource;
    private final IDUtil idUtil;
    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        log.info("M=create, checkoutRequest={}", checkoutRequest);
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(idUtil.createID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .saveAddress(checkoutRequest.getSaveAddress())
                .saveInformation(checkoutRequest.getSaveInfo())
                .shipping(ShippingEntity.builder()
                        .address(checkoutRequest.getAddress())
                        .complement(checkoutRequest.getComplement())
                        .country(checkoutRequest.getCountry())
                        .cep(checkoutRequest.getCep())
                        .build())
                .build();
        final CheckoutEntity entity = setItemsOfEntity(checkoutRequest, checkoutEntity);
        return Optional.of(entity);
     }

    private CheckoutEntity setItemsOfEntity(CheckoutRequest checkoutRequest, CheckoutEntity checkoutEntity) {
        checkoutEntity.setItems(checkoutRequest.getProducts()
                .stream()
                .map(product -> CheckoutItemEntity.builder()
                        .checkout(checkoutEntity)
                        .product(product)
                        .build())
                .collect(Collectors.toList()));
        final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);
        final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus().name())
                .build();
        checkoutCreatedResource.output().send(MessageBuilder.withPayload(checkoutCreatedEvent).build());
        return entity;
    }

    @Override
    public Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status) {
        final CheckoutEntity checkoutEntity =  checkoutRepository.findByCode(checkoutCode).orElse(CheckoutEntity.builder().build());
        checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
