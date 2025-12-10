package com.example.demo.controller;

import com.example.demo.Service.StripeService;
import com.stripe.model.PaymentIntent;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paiement")
public class PaiementController {

    @Autowired
    private StripeService stripeService;

    @PostMapping("/formation")
    public String payerFormation(@RequestParam Long montant) throws StripeException {
        PaymentIntent paymentIntent = stripeService.createPayment(montant * 100, "eur"); // montant en centimes
        return paymentIntent.getClientSecret(); // à utiliser côté front
    }
}
