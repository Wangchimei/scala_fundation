package exercises

object notation extends App {
  class Person(val name: String, val favoriteMovie: String, val age: Int = 0){
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = {
      new Person(s"$name ($nickname)", this.favoriteMovie)
    }

    def unary_+ : Person =
      new Person(name, favoriteMovie, age + 1)

    def learns(topic: String): String = s"$name learns $topic"
    def learnScala: String =
      this.learns("Scala")
    def apply(): String = s"Hi, my name is $name, $age years old, and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }

  val mary = new Person("Mary", "Inception")
  println((mary + "Rockstar")())
  println((+mary).age)
  println(mary.learns("Scala"))
  println(mary.learnScala)
  println(mary(2))


}
