# Java Functional Interfaces: Function<T, R> and UnaryOperator<T>

## Function<T, R>
The `Function<T, R>` interface from `java.util.function` represents a function that accepts one argument of type `T` and produces a result of type `R`. It is commonly used for data transformations.

### **Key Method:**
```java
R apply(T t);
```

### **Example:** Extracting final price after discount
```java
Function<Product, Double> finalPrice =
    product -> product.getPrice() - (product.getPrice() * product.getDiscountPercent() / 100);
```
Here, `finalPrice` takes a `Product` object and returns a `Double` representing the discounted price.

## UnaryOperator<T>
The `UnaryOperator<T>` is a specialized form of `Function<T, T>` where the input and output types are the same. It is useful for operations that transform a value without changing its type.

### **Key Method:**
```java
T apply(T t);
```

### **Example:** Applying local taxes
```java
UnaryOperator<Double> localTaxes = price -> price >= 2500 ? price * 1.085 : price;
```
Here, `localTaxes` takes a `Double` and returns a `Double` with the applied tax.

## **Chaining Functions with andThen()**
The `andThen()` method allows composing multiple functions sequentially, passing the result of one function as input to the next.

### **Example:**
```java
String price = finalPrice
    .andThen(localTaxes)
    .andThen(deliveryTaxes)
    .andThen(roundValue)
    .andThen(formatValue)
    .apply(p);
```
This pipeline applies:
1. Discount calculation (`Function<Product, Double>`)
2. Local taxes (`UnaryOperator<Double>`)
3. Delivery charges (`UnaryOperator<Double>`)
4. Rounding (`UnaryOperator<Double>`)
5. Formatting (`Function<Double, String>`)

## **Conclusion**
- Use `Function<T, R>` when transforming from one type to another.
- Use `UnaryOperator<T>` when modifying a value while keeping the same type.
- Chain multiple operations using `andThen()` for clean and readable code.

