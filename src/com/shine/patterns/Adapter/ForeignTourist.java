package com.shine.patterns.Adapter;

import com.shine.patterns.io.IO;

/**
 * Created by sheng on 5/7/15.
 */
public abstract class ForeignTourist {
    private int priceWillingToPay;
    private String currencyUnit;

    public ForeignTourist() {
        priceWillingToPay = 0;
        currencyUnit = "$";
    }

    public void makeAnOffer(int price, String unit) {
        this.priceWillingToPay = price;
        this.currencyUnit = unit;
    }

    public abstract int translateOffer();

    public int getPriceWillingToPay() {
        return priceWillingToPay;
    }

    public void setPriceWillingToPay(int priceWillingToPay) {
        this.priceWillingToPay = priceWillingToPay;
    }
}
