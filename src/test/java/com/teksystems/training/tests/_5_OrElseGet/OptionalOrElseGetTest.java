package com.teksystems.training.tests._5_OrElseGet;

import com.teksystems.training.business.Item;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;

import static com.teksystems.training.tests.helper.ItemMatcher.hasProperties;
import static org.junit.Assert.assertThat;

public class OptionalOrElseGetTest {

    @Test
    public void itShouldReturnResultFromSupplierWhenEmptyOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.empty();

        //When
        Item item = emptyOptional.orElseGet(new Supplier<Item>() {
            @Override
            public Item get() {
                return new Item("Book", 12.50);
            }
        });

        //Then
        assertThat(item, hasProperties("Book", 12.50));
    }

    @Test
    public void itShouldGetResultFromOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.of(new Item("Bare of Chocolate", 5.99));

        //When
        Item item = emptyOptional.orElseGet(new Supplier<Item>() {
            @Override
            public Item get() {
                return new Item("Book", 12.50);
            }
        });

        //Then
        assertThat(item, hasProperties("Bare of Chocolate", 5.99));
    }
}
