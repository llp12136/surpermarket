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

    BigDecimal calculateSalePrice(List<Goods> goodsList) {
        BigDecimal saleprice = BigDecimal.ZERO;
        for (Goods goods : goodsList) {
            if (!goods.notSale(goods.getGoodsType())) {
                saleprice = saleprice.add(goods.getPrice());
            }
        }
        return saleprice;
    }
    BigDecimal calculateNotSalePrice(List<Goods> goodsList) {
        BigDecimal notsaleprice = BigDecimal.ZERO;
        for (Goods goods : goodsList) {
            if (goods.notSale(goods.getGoodsType())) {
                notsaleprice = notsaleprice.add(goods.getPrice());
            }
        }
        return notsaleprice;
    }
    int calculateScore(BigDecimal price, List<Goods> goodsList) {
        BigDecimal score = BigDecimal.ZERO;
        Calculator calculator = new Calculator();
        BigDecimal salePrice = calculator.calculateSalePrice(goodsList);

        for (Goods goods : goodsList) {
            if (goods.notSale(goods.getGoodsType())) {
                score = score.add(goods.getPrice());
            }
        }

        score = score.add(salePrice.multiply(BigDecimal.valueOf(2)));
        return score.intValue();
    }
}
