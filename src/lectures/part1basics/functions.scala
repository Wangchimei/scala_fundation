package lectures.part1basics

object functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  // When you need loops, use recursive function instead
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello", 3))

  // function can also return unit type (execute side effects)
  // We normally need functions with side effects if we want something that has nothing to do with computation
  // e.g. printing sth to the console, displaying sth on screen, writing to a file...
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }
  println(aBigFunction(10))
}


//Parameter name:type
//return a string
