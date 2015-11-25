package com.teksystems.training.business;

public class PriceCalculator implements ICalculator {

    private final Item item;
    private final Double tax;

    public PriceCalculator(final Item item, final Double tax) {
        this.item = item;
        this.tax = tax;
    }

    @Override
    public Double calculatePrice() {
        final double basePrice = this.item.getBasePrice();
        return Math.floor(basePrice * this.tax + (basePrice * 100)) / 100;
    }

    public Item getItem() {
        return item;
    }

    public Double getTax() {
        return tax;
    }
}
