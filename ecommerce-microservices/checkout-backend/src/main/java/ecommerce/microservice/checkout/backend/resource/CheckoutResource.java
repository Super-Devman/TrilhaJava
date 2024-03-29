package ecommerce.microservice.checkout.backend.resource;

import ecommerce.microservice.checkout.backend.entity.CheckoutEntity;
import ecommerce.microservice.checkout.backend.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create(@RequestBody CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = checkoutService.create(checkoutRequest).orElseThrow();
        final CheckoutResponse response = CheckoutResponse.builder()
                .code(checkoutEntity.getCode())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
























