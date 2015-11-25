package com.teksystems.training.tests._3_OfNullable;

import org.junit.Test;
import org.mockito.BDDMockito;

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
        assertThat(Optional.ofNullable(nullable).isPresent(), is(false));
    }

    @Test
    public void itShouldReturnTrueOfNullableNotNull() {
        //Given, When
        Optional<String> name = Optional.ofNullable("My mane is");

        //Then
        assertThat(name.isPresent(), is(true));
    }
}
