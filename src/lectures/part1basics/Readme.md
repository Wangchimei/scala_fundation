## Basic
Functional programming involves working less with variables

#### Value
immutable: cannot be reassigned
```
val x: Int = 2
```

#### Variables
mutable: can be reassigned
```
var x: Int = 1
x = 1
x += 1
```

- Functional Programming prefer vals over vars
- All vals and vars have types
- compiler automatically infers types when omitted
- basic types
    - Boolean
    - Int, Long, Short, Float, Double
    - String, Character

#### Basic expression
```
val x = 3 + 5
val xIsEven = x % 2 == 0
val xIsOdd = !xIsEven
```
- IF in Scala is an expression 
    ```
      val cond: Boolean = false
      val i = if (cond) 42 else 0
    ```
- Code Block in Scala is also an expression
    ```
      val x = {
        val cond: Boolean = false
        val i = if (cond) 42 else 0
      }
    ```
    - the value od the block is the value of its last expression

- Expressions vs Instructions
    - expressions (like Scala)
        - expressions are evaluated
        - an expression which means give me the value of something
    - instructions (like Java, Python)
        - instructions are executed
        - an instruction means do something