# Functional Programming + Lambda

## Comparator (Functional Interface) Experience

- Suppose you have a Product class, with Name and Price attributes


- #1 solution: We can implement products comparison by using the Comparable<Product> interface
- Nonetheless, your class won't be closed to alterations: if the comparison criteria changes, 
you have to directly
alter the Product class


- #2 solution: So you can use the `sort()` default method of `List` interface:
  - `default void sort(Comparator<? super E> c)`
  - We can create a `MyComparator` class that implements `Comparator<T>` to store the `compareTo()` method


- #3 solution: we can declare an anonymous class to be used in the `List.sort()` param
- Although it is not a bad solution, it is unnecessarily verbose


- #4 solution: we can define the Comparator inside the `List.sort()` params, using arrow functions (lambda)

## Function Programming
In functional programming, functions are first-class objects, meaning they can be assigned to variables, passed as
arguments, and returned from other functions. Java introduced functional programming features with lambda expressions
and method references in Java 8, allowing functions to be treated as objects.

### Method References in Java

A method reference is a shorthand syntax for lambda expressions when a method is already defined. It improves code
readability by eliminating redundant lambda expressions.

## Syntax & Types of Method References

Method references use the `::` operator and come in four forms:

### Reference to a Static Method

```java
Function<Integer, String> converter = String::valueOf;
```
Equivalent to:
```java
Function<Integer, String> converter = (num) -> String.valueOf(num);
```

### Reference to an Instance Method of a Particular Object

```java
String text = "hello";
Supplier<String> supplier = text::toUpperCase;
```
Equivalent to:
```java
Supplier<String> supplier = () -> text.toUpperCase();
```

### Reference to an Instance Method of an Arbitrary Object of a Specific Type

```java
Function<String, Integer> lengthFunction = String::length;
```
Equivalent to:
```java
Function<String, Integer> lengthFunction = str -> str.length();
```

### Reference to a Constructor
```java
Supplier<List<String>> listSupplier = ArrayList::new;
```
Equivalent to:
```java
Supplier<List<String>> listSupplier = () -> new ArrayList<>();
```
By using method references, Java allows for more concise and readable functional programming, making it easier to work with streams, collections, and functional interfaces.

## Predicate
- `Predicate<T>` is an interface with `test()` abstract method
- This method will test a condition and returns a `boolean` according to the expression
- Lambda expressions can be passed as a predicate

## Consumer
- `Consumer<T>` is an interface with `accept(T t)` abstract method
- This `void` method will perform an operation on the given argument
- Lambda expressions can be passed as a predicate

## Function
- `Function<T, R>` is an interface with `R apply(T t)` abstract method
- This method will perform an operation on the given argument and returns a `R result`
- Lambda expressions can be passed as a predicate

### `map()` function
- `map()` is a function that applies another function to all the elements of a `Stream`
- Converting `List` to `Stream`: `.stream()`
- Converting `Stream` to `List`: `.collect(Collectors.toList())`