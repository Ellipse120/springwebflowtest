package com.lu.pizza.service;


import com.lu.pizza.domain.Order;
import org.apache.log4j.Logger;

/**
 * Created by Lusai on 10/6/16.
 */
public class OrderServiceImpl {
    private static final Logger LOGGER = Logger.getLogger(OrderServiceImpl.class);

    public OrderServiceImpl(){}

    public void saveOrder(Order order){
        LOGGER.debug("SAVING ORDER:  ");
        LOGGER.debug("  Customer:  " + order.getCustomer().getName());
        LOGGER.debug("  # of Pizzas:  " + order.getPizzas().size());
        LOGGER.debug("  Payment:  " + order.getPayment());
    }
}
