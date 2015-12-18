package com.teksystems.training.helper;

import com.teksystems.training.business.Item;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class ItemMatcher {

    public static Matcher<Item> hasProperties(final String name, final double price) {
        return new BaseMatcher<Item>() {
            public boolean matches(final Object input) {
                Item item = (Item) input;
                return name.equals(item.getName()) && price == item.getBasePrice();
            }

            public void describeTo(final Description description) {
                description.appendText(name + " or " + price + " does not match");
            }
        };
    }
}
