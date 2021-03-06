package com.thoughtworks.surpermarket;


import java.math.BigDecimal;

class Goods {
    private String name;
    private BigDecimal price;
    private GoodsType goodsType;

    public Goods(String name, BigDecimal price, GoodsType goodsType) {
        this.name = name;
        this.price = price;
        this.goodsType = goodsType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public boolean notSale(GoodsType goodsType){
        return goodsType.equals(GoodsType.OTHER);
    }

}
