package collections

object FlatMapWithOption extends App {

  def toInt(s: String):Option[Int] = {
    try{
      Some(s.toInt)
    }catch {
      case e : NumberFormatException => None
    }
  }

  val arguments = List("10", "eight", "5", "Four", "3", "20", "One")
  //when a flatMap is passed a function that provides an option then
  //flatMap ignores the None part

  val sum = arguments.flatMap(toInt(_)).sum
  println(sum)

}
