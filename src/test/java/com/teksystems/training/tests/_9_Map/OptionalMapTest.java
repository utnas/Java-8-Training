package com.teksystems.training.tests._9_Map;

import com.teksystems.training.business.Item;
import com.teksystems.training.business.PriceCalculator;
import com.teksystems.training.business.builder.PriceCalculatorBuilder;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class OptionalMapTest {

    @Test(expected = NullPointerException.class)
    public void itShouldThrowNullPointerExceptionWhenItemIsNull() throws Throwable {
        // Given
        Item item = null;
        Double tax = 7.50;
        PriceCalculatorBuilder builder = new PriceCalculatorBuilder();

        //When
        builder.build(item, tax);

        // Then
        fail("it should throw a NullPointerException, verify the builder, something was wrong");
    }

    @Test
    public void itShouldMapTaxValueWhenZeroToOne() throws Throwable {
        // Given
        Item item = new Item("Book", 12.05);
        Double tax = 0.0;
        PriceCalculatorBuilder builder = new PriceCalculatorBuilder();

        //When
        PriceCalculator calculator = builder.build(item, tax).getPriceCalculator();

        //Then
        assertThat(calculator.getTax(), is(1.0));
    }
}
