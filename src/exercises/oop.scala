package exercises

object oop extends App {

  val writerA = new Writer("George", "Lucas",1944)
  val writerB = new Writer("George", "Liu", 1944)
  var novel = new Novel("Shadow Moon", 1995, writerA)
  println(writerA.fullName)

  println(novel.authorAge)
  println(novel.isWrittenBy(writerB))

  val counter = new Counter
  counter.increment.print
  counter.increment.increment.print
  counter.inc(10).print

}

class Writer(firstName: String, lastName: String, val birthYear: Int) {
  def fullName: String = firstName + " " + lastName
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge: Int = yearOfRelease - author.birthYear
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
//  def count(): Int = n
// returning a new count rather than modifying the current count is called immutability
// in functional language, whenever you need to modify the contents of an instance, you need to return a new instance
  def increment: Counter = {
    println("incrementing")
    new Counter(count + 1)
  }

  def decrement: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  // recursion
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else increment.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else decrement.dec(n - 1)
  }

  def print: Unit = println(count)
}

