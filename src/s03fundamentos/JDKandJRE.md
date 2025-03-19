# JDK and JRE
## JDK (Java Development Kit)
- A complete set of tools for Java Development.
- Includes JRE + compiler (`javac` - compiles `.java` into bytecode, `.class`) + development libs.
- Required for developers who create and compile Java code.
- Contains tools such as `javac`, `jar`, `javadoc`, among others.

## JRE (Java Runtime Environment)
- Environment necessary for running Java applications (compiler `javac` is not included).
- Contains the JVM (Java Virtual Machine - that executes the bytecode file).
- Ideal for users who just want to run Java programs.

---

## JVM (Java Virtual Machine)
- The JVM is essentially an **engine** or environment designed to execute Java Programs.
- Its main role is to take the bytecode (compiled by `javac`) and run it on the user's OS
- The JVM does this by translating the bytecode into **machine code**, which is the low-level\
code that a computer's processor understands

### Key Features of the JVM
1. **Platform Independence**: Bytecode is the same across all platforms (Windows, macOS, Linux, etc.).\
The JVM ensures that the same program can run anywhere, as long as a compatible JVM is present.\
"Write Once, Run Anywhere".
2. **Memory Management**: The JVM handles tasks like **garbage collection** (automatically reclaiming\
unused memory) which makes Java more efficient and easier to use.

---

## Summary
**JDK** is used for development (writing and compiling code), while the **JRE** is just for running\
Java applications. **JDK already includes JRE**.