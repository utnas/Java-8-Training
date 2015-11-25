package com.teksystems.training.tests._4_OrElse;

import com.teksystems.training.business.Item;
import org.junit.Test;

import java.util.Optional;

import static com.teksystems.training.tests.helper.ItemMatcher.hasProperties;
import static org.junit.Assert.assertThat;

public class OptionalOrElseTest {

    @Test
    public void itShouldReturnDefaultValueFromEmptyOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.empty();

        //When
        Item defaultItem = emptyOptional.orElse(new Item("Book", 12.50));

        //Then
        assertThat(defaultItem, hasProperties("Book", 12.50));
    }

    @Test
    public void itShouldReturnOptionalValueFromAnNoneEmptyOptional() {
        //Given
        Optional<Item> emptyOptional = Optional.of(new Item("Bare of Chocolate", 5.99));

        //When
        Item item = emptyOptional.orElse(new Item("Book", 12.50));

        //Then
        assertThat(item, hasProperties("Bare of Chocolate", 5.99));
    }
}
