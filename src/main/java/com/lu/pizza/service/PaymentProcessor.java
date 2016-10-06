package com.lu.pizza.service;

import com.lu.pizza.PaymentException;

/**
 * Created by Lusai on 10/6/16.
 */
public class PaymentProcessor {
    public PaymentProcessor() {
    }

    public void approveCreditCard(String creditCardNumber, String expMonth, String expYear, float amount) throws PaymentException {
        if (amount > 20) {
            throw new PaymentException();
        }
    }
}
