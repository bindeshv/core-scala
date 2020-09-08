package example

import scala.util.Random

object PatternMatch extends App{
  //pattern match on constants
 // val number = 5
  val number = 10
  val eval = number match {
              case 1 => "One"
              case 2 => "Two"
              case 5 => "Five"
              case _ => "Nothing matched!"
            }
  println(eval)
  //pattern matching with case classes
  case class Book(title: String, yearPublished: Integer, author: String, isbn: String)
  val progInScala = Book("Programming in Scala, 3rd Edition", 2016, "Martin Odersky", "098154178")
  val funProgInScala = Book("Functional Programming in Scala", 2014, "Paul Chiusano", "898982982")
  progInScala match {
    case Book(title, yearPublished, author, isbn) => println(s"$title : $yearPublished : $author : $isbn")
    case _ => println("Did not match anything")
  }
  //choose only fields that you want in pattern matching
  //in this case we are only interested in author
  funProgInScala match {
    case Book(_, _, author, _) => println(author)
    case _ => println("no author found!")
  }
  //match on sequences
  //use case: you want to get the 2nd element in a list for which you don't know the size of the list
  val scores = List(90, 98, 100, 56, 35)
  val score2nd = scores match {
    case List(_,sec, _*) => sec
    case _ => println("nothing found")
  }
  println("Printing the 2nd score=" + score2nd)
  //pattern match on type
  case class Car(model: String)
  case class Trip(to: String)
  case class Cash(amount: Integer)
  case class NoPrize(message: String = "You haven't won!")

  val magicBucket = List(NoPrize(), Car("Tesla"), Trip("Bali"),
    Trip("Minsk"), Car("Audi"),
    Cash(1000),
    NoPrize(),
    Cash(10000),
    Trip("Switzerland")
    ,NoPrize()
  )

  Random.shuffle(magicBucket).take(1)(0) match {
    case c: Car => println(s"You have won a ${c.model}")
    case m: Cash => println(s"You won cash worth ${m.amount} dollars")
    case t: Trip => println(s"You have won a trip to ${t.to}")
    case n: NoPrize => println(n.toString)
  }
}
