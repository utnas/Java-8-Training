package com.teksystems.training.tests.helper;

import com.teksystems.training.business.Item;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class ItemMatcher {

    public static Matcher<Item> hasProperties(final String name, final double price) {
        return new BaseMatcher<Item>() {
            @Override
            public boolean matches(final Object input) {
                Item item = (Item) input;
                return item.getName().equals(name) && item.getBasePrice() == price;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText(name + " or " + price + " does not match");
            }
        };
    }

}
