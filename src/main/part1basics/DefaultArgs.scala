package lectures.part1basics

object DefaultArgs extends App {
  def factorialTailrec(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else factorialTailrec(n - 1, n * acc)

  val fact10 = factorialTailrec(10) //last arg is omitted

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit =
    println("picture saved")

  savePicture()

  // Problem: if giving savePicture(800), the compiler will be confused
  // Solution:
  // 1. pass in every leading argument
  // 2. name the argument. e.g. savePicture(width = 800)
}
