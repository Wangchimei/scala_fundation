package lectures.part1basics

object CBVvsCBN extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  //RESULT:
  //by value: 728468690515859
  //by value: 728468690515859
  //by name: 728468752604332
  //by name: 728468752634666

  //Call by value:
  //the value of the expression System.nanoTime() is computed before the function evaluates
  //Call by name:
  //the value of the expression System.nanoTime() is evaluated every time

  // "=>" it delays the evaluation of expression passed as a parameter as it's used literally every time

}
