# OOP

## OOP Basic
- Defining classes
  ```
  class Person(name: String, age: Int)
  ```
  
- Instantiating
  ```
  val person = new Person("Thor",24)
  ```
  
- Parameter vs Field
  Class parameters are NOT fields that can be access by dot operator.
  To convert a class parameter to a field is to add `val` or `var` before the parameter.
  Then, you can access it with `person.age`.
  ```
  class Person(name: String, val age: Int)
  ```
  
- Defining method
  ```
  def greet(name: String): String = {...}
  ```
  
- Calling method
  ```
  val welcome = person.greet("John")
  ```
 
 - Overloading  
  It means defining methods with the same name but different signature (different numbers of params, parameters of different type)
    ```
    def greet(name: String): Unit = {...}
    def greet(): Unit = {...}
    ```

 - The keyword `this`
 A method with parameters, when using `$name` is actually refer to parameter, use `$this.name` to access variables at class level.(*1)
 A method without parameters, `$name` is the same as `$this.name`, which is at class level.(*2)
    ```
    val person = new Person("Thor",24)
    
    class Person(name: String, val age: Int) {
      def greet(name: String): Unit = println(s"$name is not the same as ${this.name}") //*1
      def greet(): Unit = println(s"$name is the same as ${this.name}") //*2
    }
    ```
## Method Notation
#### Infix Notation
  operator notation (syntactic sugar) only works with methods with one parameter.
  `object method parameter` is equivalent to `object.method(parameter)`
  ```
  class Person(val name: String, favoriteMovie: String){
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")
  val tom = new Person("Tom", "Fight Club")

  println(mary hangOutWith tom)
  println(mary.hangOutWith(tom))
  println(mary + tom)
  ```
  In fact, mathematical operators is with the same concept.
  **ALL OPERATORS ARE METHODS**
  ```
  println(1 + 2)
  println(1.+(2))
  ```

#### Prefix Notation
  `val x = -1` is equivalent to `val x = 1.unary_-`
  ```
  class Person(val name: String, favoriteMovie: String){
    def unary_! : String = s"$name!!!!!!!!!!!!!"
  }

  val mary = new Person("Mary", "Inception")

  println(!mary)
  println(mary.unary_!)
  ```

#### Postfix Notation (not practical)
  ```
  class Person(val name: String, favoriteMovie: String){
    def isAlive: Boolean = true
  }

  val mary = new Person("Mary", "Inception")
  println(mary.isAlive)
  println(mary isAlive)
  ```
 #### Apply()
  `apply` defines with no parameter can be executed with `object()`
  ```
  class Person(val name: String, favoriteMovie: String){
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }
 
  val mary = new Person("Mary", "Inception")
 
  println(mary.apply())
  println(mary()))
  ```
 