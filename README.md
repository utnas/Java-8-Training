# JAVA 8 training about Optional object container

### Goal
The goal of this sample example is to explore a new concept in Java 8 called Optional.

### Presentation

Java 8 introduced a type Optional<T>, which can be used to handle potentially missing values.
It does so by wrapping a reference (which might be null) and providing some nice methods
to interact with the value in case it’s present.

In fact, Optional is a container object which may or may not contain a non-null value.
If a value is present, isPresent() will return true and get() will return the value.
