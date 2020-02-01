# Basic
Functional programming involves working less with variables

## Value
immutable: cannot be reassigned
```
val x: Int = 2
```

##Variables
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

## Expression
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
        
## Functions
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
    
  When 99% of time we call a function with the same params...  
  the parameter can be set with a default value, and omitted when call
  ```
    def factorial(x: Int, acc: Int = 1): Int = {
      ...
    }
  ```
   However, since the leading default arguments cannot be omitted, we **name the parameters**.
   ```
    def greet(name: String = "Shiba", age: Int = 3): String =
      s"Hi, I am $name and I am $age years old."
    
    greet(age = 5)
    greet(name = "Sully", age = 5)
    greet(age = 5, name = "Doggy")
   ```

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
    
## String
#### specific for Scala
```
  val str = "Hello"
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  //prepend (+:) and append (:+)
  println('a' +: aNumberString :+ 'z') //a45z
  println(str.reverse)
  println(str.take(2)) //He
```

#### String interpolators
`s"..."` `f"..."` `raw"..."` interpolated formatted string
`$name` `$age` will expand value based on the _value name_

- S-interpolators
    ```
      val greeting = s"Hello, my name is $name and I am $age years old."
      val greeting2 = s"Hello, my name is $name and I will be turning ${age + 1} years old."
    ```

- F-interpolators
    ```
      val speed = 1.2f
      val myth = f"$name can eat $speed%2.2f burgers per minute."
    ```
    `%2.2f`: two characters total, minimum & 2 decimal precision 

- Raw-interpolators
    This ignores escape characters, but injected variables DO get escape.
    ```
      println(raw"This is a \n newline")  // not escape
      val str = "This is a \n newline"
      println(raw"$str")                  // escape
    ```