package com.thoughtworks.surpermarket;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void should_return_score_1_when_calculate_given_price_1() {
        Goods goods = new Goods("WATER", BigDecimal.valueOf(1), GoodsType.OTHER);
        List<Goods> goodsList = Arrays.asList(goods);
        Calculator calulator = new Calculator();
        int result = calulator.calculatePrice(goodsList).intValue();
        assertEquals(1, result);
    }

    @Test
    public void should_return_score_100_when_calculate_given_price_100() {
        Goods goods = new Goods("APPLE", BigDecimal.valueOf(100), GoodsType.OTHER);
        List<Goods> goodsList = Arrays.asList(goods);
        Calculator calulator = new Calculator();
        int result = calulator.calculatePrice(goodsList).intValue();
        assertEquals(100, result);
    }
}
