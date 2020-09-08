package example

object FunctionsUsage extends App{

  def plusOneOrZero(number : Int): Int = {
    if (number < 0) 0
    else number + 1
  }

  println(plusOneOrZero(-1))
  println(plusOneOrZero(21))

  //function that two arguments
  def product(a : Int, b : Int): Int = {
    if ( a == 0 || b == 0) 0
    else
      a * b
  }

  println("Calling product")
  println(product(0, 2))
  print(product(100, 100))
  println()

  println("Anonymous functions")
  //anonymous functions
  val func = (a : Int, b : Int) => a * b
  println(func(2,2))
}


