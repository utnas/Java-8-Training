package com.teksystems.training.tests._7_IfPresent;

import com.teksystems.training.business.Item;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;

public class OptionalIfPresentTest {

    @Test
    public void itShouldReturnValueIfPresent() {
        //Given
        Optional optionalItem = Optional.of(new Item("Book", 12.25));
        final List<String> result = newArrayList();

        //When
        /*
        optionalItem.ifPresent(new Consumer() {
            @Override
            public void accept(Object o) {
                result.add("Book");
            }
        }.andThen());
        */

        //Then
        //assertThat(optionalItem.get(), );
    }
}
