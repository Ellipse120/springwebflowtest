package com.lu.pizza.domain;

import java.io.Serializable;

/**
 * Created by Lusai on 10/6/16.
 */
public class PaymentDetails implements Serializable {
    private PaymentType paymentType;
    private String creditCardNumber;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
