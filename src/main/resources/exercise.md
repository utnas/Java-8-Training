## Exercise 7 - Filter Optional of Item Line

### Case 1 - Implement the filter regarding the value of price
Return only the item with price less than the provided value

##### Solution
```

    for (final Item item : items) {
        Optional.of(item)
                .filter(ifIsGreaterThan(value))
                .ifPresent(addItemTo(filteredItemList));
    }
    
    private Predicate<Item> ifIsGreaterThan(final double value) {
        return new Predicate<Item>() {
            public boolean test(final Item item) {
                return value >= item.getBasePrice();
            }
        };
    }
    
    private Consumer<Item> addItemTo(final Collection<Item> items) {
        return new Consumer<Item>() {
            public void accept(final Item item) {
                items.add(item);
            }
        };
    }
    
```

### Case 2 - Bonus, Return Item all Books with price less than 10.0
##### Solution
```
    // Your solution
```

## Exercise 8 - PriceCalculator Builder

### Add functionality to preserve code from null values.

#### Case 1 - If Item is null

If the argument item is null throw a new NullPointerException with specific message otherwise the item should be used in priceCalculator.

##### Solution
```

    final Item localItem = ofNullable(item).orElseThrow(itemNullPointerException());

    // Helper
    private Supplier<Throwable> itemNullPointerException() {
        return new Supplier<Throwable>() {
            public Throwable get() {
                return new NullPointerException("Value was null");
            }
        };
    }
```

#### Case 2 - If tax is null

If the argument tax is less than zero, the value of tax should be transformed to 1.0 otherwise the value of tax should be used in priceCalculator.

##### Solution
```

    final Double localTax = ofNullable(tax).map(zeroToOne()).get();
    
    // Helper
    private Function<Double, Double> zeroToOne() {
        return new Function<Double, Double>() {
            public Double apply(Double aDouble) {
                return aDouble == 0 ? Double.valueOf(1.0) : aDouble;
            }
        };
    }
```
