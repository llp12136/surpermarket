package com.thoughtworks.surpermarket;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
    BigDecimal calculatePrice(List<Goods> goodsList) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Goods goods : goodsList
        ) {
            sum = sum.add(goods.getPrice());
        }
        return sum;
    }
}
