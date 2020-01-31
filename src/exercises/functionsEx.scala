package exercises

object functionsEx extends App {
  // A greeting function
  def greeting(name:String, age:Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }
  println(greeting("David", 12))

  // Factorial function: recursive
  def Factorial(n: Int): Int =
    if (n <= 0) 1
    else n * Factorial(n-1)
  println(Factorial(5))

  // Fibonacci function: recursive
  // 1 1 2 3 5 8 13 21
  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  println(fibonacci(8))

  //Prime number
  def Prime(n: Int):Boolean = {
    if ((n % 2 != 0) && (n % 3 != 0) && (n % 5 != 0)) true
    else false
  }
  println(Prime(2003))

  // is n prime until t? Does n have any divisors until t?
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(13))
  // n=13 -> 13/2 代入 isPrimeUntil -> t=6 -> 13%6 != 0 (true) ->
  // 6-1 代入 isPrimeUntil -> t=5 -> 13%5 != 0 (true) -> 5-1 代入 isPrimeUntil..
}

