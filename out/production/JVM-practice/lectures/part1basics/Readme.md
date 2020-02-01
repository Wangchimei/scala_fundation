# Basic
Functional programming involves working less with variables

### Value
immutable: cannot be reassigned
```
val x: Int = 2
```

### Variables
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

### Expression
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
        
### Functions
  ```
      def functionName(parameter): intendedReturnType = {  
        println("test")  
      }
  ```
  
  Function can also return **unit type**, which executes side effects.
  We normally need functions with side effects if we want something that has nothing to do with computation.  
  E.g. printing sth to the console, displaying sth on screen, writing to a file...
  
  When you need loops, use recursive function instead. (tail recursive)  
  Any function can be turned into a tail recursive function.  
  The trick is to use an "accumulator" to store intermediate results rather than call the function recursively.

  - Tail Recursive:  
    - Use recursive call as the last expression.
    - Allow Scala to preserve the same stack frame and not use additional stack frames for recursive
    
  #### Call by Value vs Call by Name
  - Call by Value
  
  ```
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
  }
  ```

    - Value is computed before call
    - Same value used everywhere

  - Call by Name
  
  ```
  def calledByValue(x: => Long): Unit = {
    println("by value: " + x)
  }
  ```

    - expression is passed literally
    - expression is evaluated at every use within 