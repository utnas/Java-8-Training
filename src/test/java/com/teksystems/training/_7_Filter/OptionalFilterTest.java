package com.teksystems.training._7_Filter;

import com.teksystems.training.business.Item;
import com.teksystems.training.business.ItemLine;
import org.junit.Test;

import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OptionalFilterTest {

    @Test
    public void itShouldReturnItemsWithPriceLessThanTenDollars() {
        //Given
        ItemLine itemLine = new ItemLine();
        itemLine.addItems(
                newArrayList(
                        new Item("Book", 12.05),
                        new Item("Book", 20.05),
                        new Item("Pen", 2.0),
                        new Item("Watter Bottle", 0.95)
                )
        );

        //When
        Collection<Item> lessThanTEN = itemLine.filterByPriceLessThan(10.0);

        //Then
        assertThat(lessThanTEN.size(), is(2));
    }
}
