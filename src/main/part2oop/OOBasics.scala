package main.part2oop

object OOBasics extends App{

  val person = new Person("Thor",24)
  println(person.age)
  println(person.x)
  person.greet("Loki")
  person.greet()

  val person2 = new Person("Thor")
  println(person2.age)
}

// classes are blueprints that describe behavior (data, the way things work)
// constructor
// class parameters are NOT fields that can be access by dot operator.
// To convert a class parameter to a field is to add `val` or `var` before the parameter
class Person(name: String, val age: Int) {
  //definition of val or var are filed
  val x = 2 // and be access by "person.x"

  //method
  // with vals or vars in params, $name refer to parameter, use $this.name to access class level
  // without vals or vars in params, $name is equal to $this.name at a class level
  def greet(name: String): Unit = println(s"$name says: Hi, $age years old ${this.name}")
  //overloading: it means defining methods with the same name but different signature
  // (different numbers of params, parameters of different type)
  def greet(): Unit = println(s"${this.name} is the same as $name (from class level)")

  //multiple constructor: can be easily solved by supplying a default parameter
  def this(name:String) = this(name, 0)
}