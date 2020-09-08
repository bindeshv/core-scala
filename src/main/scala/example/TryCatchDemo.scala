package example
import scala.util.{Try,Success,Failure}


object TryCatchDemo extends App{

  val result = Try(10/0)

  //pattern matching
  result match {
    case Success(value) => println("Computation succeeded!")
    case Failure(e) =>{
      println(e.getMessage())
      print(e.getStackTrace())
    }
  }

}
