package com.teksystems.training.business;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.unmodifiableCollection;

public class ItemLine {

    private final List<Item> items = newArrayList();

    public boolean addItems(final Collection<Item> items) {
        return this.items.addAll(items);
    }

    public Collection<Item> filterByPriceLessThan(final double value) {
        final Collection<Item> filteredItemList = newArrayList();

        // Implement the filter regarding the value
        for (final Item item : items) {
            // Code here
        }

        return unmodifiableCollection(filteredItemList);
    }
}