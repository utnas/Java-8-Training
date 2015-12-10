package com.teksystems.training.business;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.google.common.collect.Lists.newArrayList;

public class ItemLine {

    private List<Item> items = newArrayList();

    public boolean addItems(final Collection<Item> items) {
        return this.items.addAll(items);
    }

    public Collection<Item> filterByPriceLessThan(final double value) {
        final Collection<Item> filteredItemList = newArrayList();

        // Implement the filter regarding the value
        for (final Item item : items) {
            // Code here
        }

        return filteredItemList;
    }
}