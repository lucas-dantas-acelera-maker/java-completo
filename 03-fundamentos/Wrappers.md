# Wrappers

## Introduction

Wrappers are objects that encapsulate primitive types.

- `Byte` -> `byte`
- `Short` -> `short`
- `Long` -> `long`
- `Integer` -> `int`
- `Float` -> `float`
- `Double` -> `double`
- `Character` -> `char`
- `Boolean` -> `boolean`

When working with primitive types, the values attributed to these, are simply the bits value.\
If you use Wrapper classes, the polymorphism rule will be applied, since you're working with references to the objects.

### Example
```
public class WrapperTest01 {
    public static void main(String[] args) {
        int x = 10; // 10 bits
        float y = 10; // 10 bits

        if (x == y) {
            System.out.println("true!");
        }
    }
}
```

Although they're different types, you can still compare it since they have the same value (10 bits)

```
public class WrapperTest01 {
    Integer x = 10;
    // Float y = 10; -> WRONG
    Float y = 10F;
}
```

Using a `Wrapper`, you have references to the object created in memory and the polymorphism is applied.\
`Float f` must match the `Comparable<Float>` interface criteria.

---

## AutoBoxing and Unboxing

- **Autoboxing**: Java can transform primitive types into `Wrapper` classes. It happens when we instantiate an\
    object with a value.
- **Unboxing**: Java can also transform `Wrapper` classes into primitive types, when you attribute an object\
    to a variable.


---

### Data Structures like Lists, Arrays, Collections don't work with primitive types, so you have to use a `Wrapper`.

