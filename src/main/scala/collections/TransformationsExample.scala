package collections

object TransformationsExample {

  //example shows how you can transform a data to another shape

  def main(args: Array[String]) = {
    case class Event(location: String, dayOfWeek: String, sessionTimeInSeconds: Integer, source: String)

    val event1 = Event("US", "Sun", 10, "Twitter")
    val event2 = Event("China", "Mon", 15, "WeChat")
    val event3 = Event("New Zealand", "Sun", 30, "Twitter")
    val event4 = Event("US", "Tue", 5, "Facebook")
    val event5 = Event("US", "Thu", 24, "LinkedIn")
    val event6 = Event("US", "Sat", 60, "Facebook")

    val events = List(event1, event2, event3, event4, event5, event6)

    //find out all the locations of the users
    //the below function, essentialy, transforms a List[Event] => List[String]
    val allUserLocations = events.map(_.location)
    println("All user locations:")
    allUserLocations.foreach(println(_))

    println()
    println("All sources of users")
    //find out all sources of user visits
    events.map(_.source).foreach(println(_))



  }

}
