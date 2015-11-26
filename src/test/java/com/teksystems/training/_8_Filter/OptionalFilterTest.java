package com.teksystems.training._8_Filter;

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
        Collection<Item> items = newArrayList(new Item("Book", 12.05), new Item("Book", 20.05), new Item("Pen", 2.0), new Item("Watter Bottle", 0.95));
        ItemLine itemLine = new ItemLine();
        itemLine.addItems(items);

        Collection<Item> lessThatTEN = newArrayList();

        //When
        lessThatTEN = itemLine.filterByPriceLessThan(10.0);

        //Then
        assertThat(lessThatTEN.size(), is(2));
    }
}
