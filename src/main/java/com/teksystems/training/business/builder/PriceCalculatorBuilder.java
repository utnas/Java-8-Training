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
         * If the argument item is null throw a new Null Pointer Exception else return the item.
         * */
        final Item localItem = ofNullable(item).orElseThrow(itemNullPointerException());

        /**
         * If the argument tax is less than zero, return 1.0 else return the value of tax.
         * */
        final Double localTax = ofNullable(tax).map(zeroToOne()).get();

        priceCalculator = new PriceCalculator(localItem, localTax);

        return this;
    }

    public PriceCalculator getPriceCalculator() {
        return priceCalculator;
    }

    private Function<Double, Double> zeroToOne() {
        return new Function<Double, Double>() {
            public Double apply(Double aDouble) {
                return aDouble == 0 ? Double.valueOf(1.0) : aDouble;
            }
        };
    }

    private Supplier<Throwable> itemNullPointerException() {
        return new Supplier<Throwable>() {
            public Throwable get() {
                return new NullPointerException("Value was null");
            }
        };
    }
}
