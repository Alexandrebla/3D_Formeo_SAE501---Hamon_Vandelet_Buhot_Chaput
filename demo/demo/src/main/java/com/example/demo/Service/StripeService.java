package com.example.demo.Service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    public StripeService() {
        Stripe.apiKey = "sk_test_51SbJVp2VIZHiWGARcHei0ZutarNFle7fHLag6djxkUX5iU7LVs0ykAoB6PSucARc0zsnCBfvX6aHhycinaTDJkeX00H6mj5GJw"; // Ta clé test
    }

    public PaymentIntent createPayment(Long amount, String currency) throws StripeException {
        PaymentIntentCreateParams params =
                PaymentIntentCreateParams.builder()
                        .setAmount(amount) // en centimes
                        .setCurrency(currency) // ex: "eur"
                        .build();

        return PaymentIntent.create(params);
    }
}
