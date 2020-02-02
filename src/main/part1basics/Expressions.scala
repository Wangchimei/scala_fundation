package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //expression
  println(x)

  //Mathematical
  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  //Relational
  println(1 == x)
  // == != > >= < <=

  //Logical negation
  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  // -= *= /=

  //Instructions (DO) vs Expression (VALUE)
  //Example: IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  //  EVERYTHING in Scala is an Expression! (only definitions of vals, class, package are not)
  val aWeirdValue = (aVariable = 3) // Unit = void
  println(aWeirdValue)  // return ()

  // reassigning a variable is called side effects
  // in Scala, side effects are expression returning unit
  // side effects: printIn(), while, reassigning of vars

  // Code blocks (an expression)
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  //the value of a block is the value of its last expression
  //everything declare inside the code block stays visible within the code block
}
