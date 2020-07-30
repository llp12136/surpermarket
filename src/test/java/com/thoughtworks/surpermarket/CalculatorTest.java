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
        Calculator calculator = new Calculator();
        int result = calculator.calculatePrice(goodsList).intValue();
        assertEquals(1, result);
    }

    @Test
    public void should_return_score_100_when_calculate_given_price_100() {
        Goods goods = new Goods("APPLE", BigDecimal.valueOf(100), GoodsType.OTHER);
        List<Goods> goodsList = Arrays.asList(goods);
        Calculator calculator = new Calculator();
        int result = calculator.calculatePrice(goodsList).intValue();
        assertEquals(100, result);
    }

    @Test
    public void should_return_score_110_when_calculate_given_price_1() {
        Goods goods = new Goods("OTHER", BigDecimal.valueOf(110), GoodsType.OTHER);
        List<Goods> goodsList = Arrays.asList(goods);
        Calculator calculator = new Calculator();
        int result = calculator.calculatePrice(goodsList).intValue();
        assertEquals(110, result);
    }

    @Test
    public void should_return_score_100_when_calculate_given_xigua_apple_xiyiye() {
        Goods apple = new Goods("APPLE", BigDecimal.valueOf(10), GoodsType.APPLE);
        Goods watermelon = new Goods("WATERMELON", BigDecimal.valueOf(30), GoodsType.WATERMELON);
        Goods xiyiye = new Goods("XIYIYE", BigDecimal.valueOf(20), GoodsType.OTHER);
        List<Goods> goodsList = Arrays.asList(apple, watermelon, xiyiye);
        Calculator calculator = new Calculator();
        BigDecimal price = calculator.calculatePrice(goodsList);
        int result = calculator.calculateScore(price, goodsList);
        assertEquals(100, result);
    }
}
