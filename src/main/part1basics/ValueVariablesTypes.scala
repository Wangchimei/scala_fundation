package lectures.part1basics

object ValueVariablesTypes extends App {

  //  val x: Int = 42
    val x = 42
    println(x)

  // VALUE
  // Vals are immutable (cannot be reassigned)
  // Compiler can infer types (i.e. Types of vals are optional)
    val aBoolean: Boolean = false
    val aString: String = "Hello"
    val aCart: Char = 'a' //single character in single quote
    val anInt: Int = x
    val aShort: Short = 9374 //represent 2 bytes instead of 4
    val sLong: Long = 6473847483749374L //represent 8 bytes instead of 4
    val aFloat: Float = 2.34f
    val aDouble: Double = 3.34

  //Variables
    var aVariable: Int = 4
    aVariable = 5  //side effects
    println(aVariable)
}