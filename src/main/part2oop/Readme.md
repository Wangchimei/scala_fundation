# OOP
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
 A method with parameters, when using `$name` is actually refer to parameter, use `$this.name` to access variables at class level.
 A method without parameters, `$name` is the same as `$this.name`, which is at class level.
 