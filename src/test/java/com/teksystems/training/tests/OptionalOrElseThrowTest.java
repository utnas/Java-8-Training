
package com.teksystems.training.tests;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public final class OptionalOrElseThrowTest {

    @Test(expected = NullPointerException.class)
    public void itShouldThrowExceptionIfGetEmptyOptional() throws Throwable {
        // Given
        Optional emptyOptional = Optional.empty();

        //When, Then
        Object result = emptyOptional.orElseThrow(new Supplier() {
            public Object get() {
                return new NullPointerException();
            }
        });
        fail("Some thing went wrong, it should throw NullPointerException");
    }

    @Test
    public void itShouldNotThrowExceptionWhenNotNull() throws Throwable {
        //Given
        Optional myOptionalValue = Optional.of("My Value");

        //When
        String value = (String) myOptionalValue.orElseThrow(new Supplier() {
            public Object get() {
                return new NullPointerException();
            }
        });

        //Then
        assertThat(value, is("My Value"));
    }
}