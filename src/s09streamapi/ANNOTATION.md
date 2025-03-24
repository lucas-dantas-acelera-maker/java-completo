# Stream

- `Stream` is a solution to process data sequences in certain ways:
    - Declarative (intern iteration: hidden): you describe what will be done and the compiler will do the rest
    - Parallel-friendly (immutable -> thread safe)
    - No side effects
    - On demand (lazy evaluation)


- Sequential access (no indexes)
- Single-use: can only be used once. When done using, you can not access the `Stream` again (throws Exception)
- **Pipeline**: `Stream` operations return new Streams, this makes it possible to create an operation stream\
  (processing flow)

## Intermediate and Terminal Operations
- The Pipeline is made of zero or more intermediate operations and a terminal one

- ### Intermediate Operation:
    - Generates a new Stream
    - Only executed when a terminal operation is invoked (lazy evaluation)

- ### Terminal Operation:
    - Generates a non-stream `Object` (`Collection` or other)
    - Determinate the end of the `Stream` processing

- ### Intermediate Operation Examples:
    - `filter()`
    - `map()`
    - `flatmap()`
    - `peek()`
    - `distinct()`
    - `sorted()`
    - `skip`
    - `limit(*)`
    - ***short-circuit**: stops the execution of the `Stream` processing

- ### Terminal Operation Examples:
    - `forEach()`
    - `forEachOrdered()`
    - `toArray()`
    - `reduce()`
    - `collect()`
    - `min()`
    - `max()`
    - `count()`
    - `anyMatch(*)`
    - `allMatch(*)`
    - `noneMatch(*)`
    - `findFirst(*)`
    - `findAny(*)`
    - ***short-circuit**: stops the execution of the `Stream` processing

## Create a `Stream`
- We can call the `stram()` or `parallelStream()` method from any `Collection` object


- Other ways to create a `Stream`:
    - `Stream.of`
    - `Stream.ofNullable`
    - `Stream.iterate`