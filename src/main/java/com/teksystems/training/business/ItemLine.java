package com.teksystems.training.business;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ItemLine {

    private List<Item> items = newArrayList();

    public boolean addItems(final Collection<Item> items) {
        return this.items.addAll(items);
    }

    public Collection<Item> filterByPriceLessThan(final double value) {
        Collection<Item> filteredResult = newArrayList();
        // Implement the filter regarding the value

        return filteredResult;
    }
}
