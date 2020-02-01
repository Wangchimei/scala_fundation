package exercises

import scala.annotation.tailrec

object tailrec extends App {
  // Concatenate tail recursive
  // an accumulator needs to have the same return type as the intended return type for the function
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)

  println(concatenateTailrec("hello ", 3, ""))

  //isPrime
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToNext: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToNext, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  println(fibonacci(8))

  // n = 8 -> fiboTailrec(2, 2, 1) ->
  // 2 >= 8 (false)  -> fiboTailrec(3, 2, 1)
  // 3 >= 8 (false)  -> fiboTailrec(4, 3, 2)
  // 4 >= 8 (false)  -> fiboTailrec(5, 5, 3)
  // 5 >= 8 (false)  -> fiboTailrec(6, 8, 5)
  // 6 >= 8 (false)  -> fiboTailrec(7, 13, 8)
  // 7 >= 8 (false)  -> fiboTailrec(8, 21, 13)
  // 8 >= 8 (true)  -> last: 21
}