## PriceCalculator Builder

### Add functionality to preserve code from null values.

#### If Item is null

If the argument item is null throw a new NullPointerException with specific message else the item will be used in priceCalculator.

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

#### If tax is null
If the argument tax is less than zero, return 1.0 else the value of tax will be used in priceCalculator.

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

## Item Line

### Implement the filter regarding the value of price
Return only the item with price less that the provided value

##### Solution
```
for (final Item item : items) {
    Optional.of(item).filter(new Predicate<Item>() {
        public boolean test(final Item item) {
            return 10.0 >= item.getBasePrice();
        }
    }).ifPresent(new Consumer<Item>() {
        @Override
        public void accept(final Item item) {
            filteredResult.add(item);
        }
    });
}
```

### Bonus, Return Item with price less than 10.0 witch are named "Book"
