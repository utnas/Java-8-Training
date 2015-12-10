package com.teksystems.training._2_Of;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OptionalOfTest {

    // OF
    @Test(expected = NullPointerException.class)
    public void itShouldThrowNullPointerException() {
        //Given, When
        Optional<Object> nullable = Optional.of(null);

        //Then
        assertThat(nullable.isPresent(), is(true));
    }

    @Test
    public void itShouldReturnTrueOfNotNull() {
        //Given, When
        Optional<String> name = Optional.of("My mane is");

        //Then
        assertThat(name.isPresent(), is(false));
    }
}
