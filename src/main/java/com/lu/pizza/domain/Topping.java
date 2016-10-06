package com.lu.pizza.domain;

import org.apache.commons.lang3.text.WordUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lusai on 10/6/16.
 */
public enum Topping implements Serializable {
    PEPPERONI, // 意大利辣肉肠
    SAUSAGE,    // 香肠
    HAMBURGER,
    MUSHROOM,
    CANADIAN_BACON,
    PINEAPPLE,
    GREEN_PEPPER, //青椒
    JALAPENO, //墨西哥辣椒
    TOMATO,
    ONION,
    EXTRA_CHEESE;

    public static List<Topping> asList() {
        Topping[] all = Topping.values();
        return Arrays.asList(all);
    }

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(name().replace('_',' '));
    }
}
