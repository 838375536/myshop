package com.item.eshop.model;

import java.math.BigDecimal;
import java.util.Map;

public class TradeReport {
    BigDecimal Amount;//成交总额
    BigDecimal maxTrade;//交易最大额
    int count;//成交数量
    int sellGoodCount;//卖出商品总数
    Map<Good,Integer> sellGoodMap ;//销售商品详情
    int unpayTrade;//待付款订单
    int unsendTrade;//待发货订单
    int fairTrade;//交易失败量
    BigDecimal comparePrecedingMonth;//跟前月对比的营收情况。 月报表中用到，日报表该属性设置为0
    BigDecimal factAmout; //实际收款

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public BigDecimal getMaxTrade() {
        return maxTrade;
    }

    public void setMaxTrade(BigDecimal maxTrade) {
        this.maxTrade = maxTrade;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSellGoodCount() {
        return sellGoodCount;
    }

    public void setSellGoodCount(int sellGoodCount) {
        this.sellGoodCount = sellGoodCount;
    }

    public Map<Good, Integer> getSellGoodMap() {
        return sellGoodMap;
    }

    public void setSellGoodMap(Map<Good, Integer> sellGoodMap) {
        this.sellGoodMap = sellGoodMap;
    }

    public int getUnpayTrade() {
        return unpayTrade;
    }

    public void setUnpayTrade(int unpayTrade) {
        this.unpayTrade = unpayTrade;
    }

    public int getUnsendTrade() {
        return unsendTrade;
    }

    public void setUnsendTrade(int unsendTrade) {
        this.unsendTrade = unsendTrade;
    }

    public int getFairTrade() {
        return fairTrade;
    }

    public void setFairTrade(int fairTrade) {
        this.fairTrade = fairTrade;
    }

    public BigDecimal getComparePrecedingMonth() {
        return comparePrecedingMonth;
    }

    public void setComparePrecedingMonth(BigDecimal comparePrecedingMonth) {
        this.comparePrecedingMonth = comparePrecedingMonth;
    }

    public BigDecimal getFactAmout() {
        return factAmout;
    }

    public void setFactAmout(BigDecimal factAmout) {
        this.factAmout = factAmout;
    }
}
