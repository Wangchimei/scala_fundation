package lectures.part1basics

object StringOps extends App {

  val str: String = "Hi, I am learning Scala"

  println(str.charAt(4)) // I
  println(str.substring(4, 8)) // (inclusive, exclusive) I am
  println(str.split(" ").toList) // List(Hi,, I, am, learning, Scala)
  println(str.startsWith("Hello")) // false
  println(str.startsWith("Hi")) // true
  println(str.replace(" ", "-")) // Hi,-I-am-learning-Scala
  println(str.toLowerCase) // hi, i am learning scala
  println(str.toUpperCase)// HI, I AM LEARNING SCALA
  println(str.length)// 23

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  //prepend and append
  println('a' +: aNumberString :+ 'z') //a45z
  println(str.reverse) //alacS gninrael ma I ,iH
  println(str.take(2)) //Hi

  //Scala-specific: String interpolators
  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  val greeting2 = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(greeting2)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute."
  // %2.2f : two character total minimum, and two decimals precision
  println(myth)

  //Raw-interpolators
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
