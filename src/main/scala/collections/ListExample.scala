package collections

object ListExample {

  def main(args : Array[String]) = {
    //filtering a list
    val pageLoadTimeInSeconds = List(5, 11, 8, 24, 24, 11, 45, 55, 2, 68)
    //filter sites that took more than 10 seconds to load
    val moreThan10Seconds = pageLoadTimeInSeconds.filter( _ >= 10)// t => t >= 10 could be conciced further
    //now from this get the min load time and the max load time
    val minLoadGreaterThan10Secs = moreThan10Seconds.min
    val maxLoadGreaterThan10Secs = moreThan10Seconds.max

    println("Min > 10 secs:"  + minLoadGreaterThan10Secs)
    println("Max > 10 secs:" + maxLoadGreaterThan10Secs)

    //checking for emptiness
    //Scala provides two functions across all collections that can be used
    //isEmpty() and nonEmpty

    println("Is empty?:" + pageLoadTimeInSeconds.isEmpty)
    println("Is nonEmpty?:" + pageLoadTimeInSeconds.nonEmpty)

    //converting a collection from one type to another
    val numSet = pageLoadTimeInSeconds.toSet //this will remove any duplicate values
    println("Printing the set values:")
    numSet.foreach(println(_))

    //convert a set to list
    val rollIds = Set(1001, 20001, 439999, 67990)
    val rollIdsList = rollIds.toList

    println("Printing out sets:")
    rollIdsList.foreach(println(_))




  }

}
