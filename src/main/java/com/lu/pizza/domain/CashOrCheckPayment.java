package com.lu.pizza.domain;

/**
 * Created by Lusai on 10/6/16.
 */
public class CashOrCheckPayment extends Payment {
    public CashOrCheckPayment(){}

    @Override
    public String toString() {
        return "CASH or CHECK: $" + getAmount();
    }
}
