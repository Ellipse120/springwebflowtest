package com.lu.pizza.service;

import com.lu.pizza.domain.Customer;

/**
 * Created by Lusai on 10/6/16.
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
