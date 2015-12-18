package com.teksystems.training.business.builder;

import com.teksystems.training.business.Item;
import com.teksystems.training.business.PriceCalculator;

import java.util.function.Function;
import java.util.function.Supplier;

import static java.lang.Double.valueOf;
import static java.util.Optional.ofNullable;

public class PriceCalculatorBuilder {
    private PriceCalculator priceCalculator;

    public PriceCalculatorBuilder build(final Item item, final Double tax) throws Throwable {
        final Item localItem = null;
        final Double localTax = 0.0;

        /**
         * Case 1
         * ------
         *
         * If item is null throw a new NullPointerException with specific message
         * otherwise the item should be used in priceCalculator.
         */

        // Your code here

        /**
         * Case 2
         * ------
         *
         * If tax is less than zero, the value of tax should be transformed to 1.0
         * otherwise the value of tax will be used in priceCalculator.
         */

        // Your code here

        priceCalculator = new PriceCalculator(localItem, localTax);

        return this;
    }

    public PriceCalculator getPriceCalculator() {
        return priceCalculator;
    }
}
