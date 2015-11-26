package com.teksystems.training._1_Empty;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OptionalEmptyTest {

    // EMPTY
    @Test
    public void itShouldReturnFalseIfEmptyOptional() {
        //Given, When
        Optional emptyOptional = Optional.empty();

        //Then
        assertThat(emptyOptional.isPresent(), is(false));
    }
}
