package com.lu.pizza.domain;

import java.io.Serializable;

/**
 * Created by Lusai on 10/6/16.
 */
public abstract class Payment implements Serializable {
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
