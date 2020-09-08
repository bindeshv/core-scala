package example

object EitherDemo extends App{

  def stringToInt(in : String) : Either[String, Int] = {
    try{
      Right(in.toInt)
    }catch {
      case e: NumberFormatException => Left("Error:" + e.getMessage)
    }
  }
  val fiveToInt = stringToInt("5")
  val helloToInt = stringToInt("hello")

  println(fiveToInt)
  println(helloToInt)


}
