package com.lu.pizza.service;

import com.lu.pizza.domain.Customer;

/**
 * Created by Lusai on 10/6/16.
 */
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(){}

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
