package ecommerce.microservice.payment.api.repository;

import ecommerce.microservice.payment.api.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
