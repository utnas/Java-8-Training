package com.teksystems.training.business.builder;

import com.teksystems.training.business.Item;
import com.teksystems.training.business.PriceCalculator;

import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

public class PriceCalculatorBuilder {
    private PriceCalculator priceCalculator;

    public PriceCalculatorBuilder build(final Item item, final Double tax) throws Throwable {
        /**
         * If the argument item is null throw a new NullPointerException with specific message else the item can be used in priceCalculator.
         */

        /**
         * If the argument tax is less than zero, return 1.0 else the value of tax cal be used in priceCalculator.
         */


        //priceCalculator = new PriceCalculator(localItem, localTax);

        return this;
    }

    public PriceCalculator getPriceCalculator() {
        return priceCalculator;
    }
}
