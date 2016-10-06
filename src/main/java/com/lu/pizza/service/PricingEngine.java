package com.lu.pizza.service;

import com.lu.pizza.domain.Order;

/**
 * Created by Lusai on 10/6/16.
 */
public interface PricingEngine {
    public float calculateOrderTotal(Order order);
}
