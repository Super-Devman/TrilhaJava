package ecommerce.microservice.checkout.backend.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class IDUtil {

    public UUID createID() {
        return UUID.randomUUID();
    }
}
