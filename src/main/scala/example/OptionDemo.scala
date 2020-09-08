package example

object OptionDemo extends App{

  val employees = Set("John", "Jane", "Kane", "Keynes", "Frank", "Revin")

  val mayBeMark = employees.find(_ == "Mark")

  println("Finding Mark status=" + mayBeMark.getOrElse("Mark is not an employee"))
  println("Finding John status = " + employees.find(_ == "John").getOrElse("John is not an employee"))

}
