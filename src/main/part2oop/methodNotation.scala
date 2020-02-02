package main.part2oop

object methodNotation extends App {

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name!!!!!!!!!!!!!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")

  //infix notation = operator notation (syntactic sugar), only works with methods with one parameter
  //"object method parameter"

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  // ALL OPERATORS ARE METHODS
  println(1 + 2)
  println(1.+(2))

  //prefix notation
  //unary_prefix only works with  - + ~ !
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  //postfix notation: a method does not receive any parameters (rarely use in practice)
  println(mary.isAlive)
//  println(mary isAlive) is equivalent but can introduce potential ambiguities when reading the code

  //apply
  println(mary.apply())
  println(mary()) //equivalent
}
