package com.teksystems.training._4_OrElse;

import com.teksystems.training.business.Item;
import com.teksystems.training.helper.ItemMatcher;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertThat;

public class OptionalOrElseTest {

    @Test
    public void itShouldReturnDefaultValueIfEmptyOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.empty();

        //When
        Item defaultItem = emptyOptional.orElse(new Item("Book", 12.50));

        //Then
        assertThat(defaultItem, ItemMatcher.hasProperties("Book", 1.50));
    }

    @Test
    public void itShouldReturnOptionalValueIfNoneEmptyOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.of(new Item("Bare of Chocolate", 5.99));

        //When
        Item item = emptyOptional.orElse(new Item("Book", 12.50));

        //Then
        assertThat(item, ItemMatcher.hasProperties("Book", 12.50));
    }
}
