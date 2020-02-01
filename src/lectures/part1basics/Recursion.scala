package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
  println(factorial(10))
  // println(factorial(5000)) // StackOverFlowError

  def betterFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //tail recursive ; use recursive call as the last expression

    factHelper(n, 1)
  }
  println(betterFactorial(700))

  // FLOW
  // betterFactorial(10) -> factorialHelper(10, 1) ->
  // factorialHelper(9, 10 * 1)
  // factorialHelper(8, 9 * 10 * 1)
  // factorialHelper(7, 8 * 9 * 10 * 1)
  // factorialHelper(6, 7 * 8 * 9 * 10 * 1)
  // factorialHelper(5, 6 * 7 * 8 * 9 * 10 * 1)
  // factorialHelper(4, 5 * 6 * 7 * 8 * 9 * 10 * 1)
  // factorialHelper(3, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  // factorialHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  // factorialHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  //  -> 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10

  // WHY first factorial does not work when the number is too big?
  // writing factHelper as the last expression of it code path,
  // this allows Scala to preserve the same stack frame and not use additional stack frames for recursive

  //Any function can be turned into a tail recursive function.
  //The trick is to use an "accumulator" to store intermediate results rather than call the function recursively
}
