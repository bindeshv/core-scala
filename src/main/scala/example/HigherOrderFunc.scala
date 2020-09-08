package example

object HigherOrderFunc extends App{

  case class Fruit(name : String)

  val apple = Fruit("Apple")
  val orange = Fruit("Orange")
  val kiwi = Fruit("Kiwi")

  val fruitBasket = List(apple, orange, kiwi, orange, apple, kiwi, apple, orange, kiwi, kiwi, apple)

  //filter using lambda
  println("\n Filtering for apples using Lambda")
  val appleList = fruitBasket.filter(fruit => fruit.name == "Apple")
  println(appleList)
  appleList.foreach(f => println(f.name))

  //use underscore to remove the verbosity  in lambda
  //remember: can only be used if the value is used on the right hand side only once
  println("\n Using underscore")
  val orangeList = fruitBasket.filter(_.name == "Orange")
  orangeList.foreach( item => println(item.name))

  //for example, if we were to use two items in the filter predicate then it won't work
  //fruitBasket.filter(_.name == "Apple" || _.name == "Orange")
  //for checking more than one condition we should do something like this

  val applesOrOrangesList = fruitBasket.filter(fruit => fruit.name == "Apple" || fruit.name == "Orange")
  println("\n Printing Apple and Orange list")
  applesOrOrangesList.foreach(item => println(item.name))


}
