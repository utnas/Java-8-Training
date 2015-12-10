package com.teksystems.training._3_OfNullable;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OptionalOfNullableTest {

    // OF NULLABLE
    @Test
    public void itShouldReturnFalseWhenOfNullableOfNull() {
        // Given, When
        Object nullable = null;

        // Then
        assertThat(Optional.ofNullable(nullable).isPresent(), is(true));
    }

    @Test
    public void itShouldReturnTrueOfNullableNotNull() {
        //Given, When
        Optional<String> name = Optional.ofNullable("My mane is");

        //Then
        assertThat(name.isPresent(), is(false));
    }
}
