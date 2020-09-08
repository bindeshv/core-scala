package collections

object FlatMapExample {

  def main(args: Array[String]) = {
    //programming challenge:
    //Given a list that has lists as its elements, nestedList
    val nestedList = List( List(1,2,3,4), List(5,6,7,8))
    //Increment every number in the nested list
    //And return the result as one list instead of nested list

    var flattenedMap = nestedList.map(aList => aList.map(_ + 1)).flatten
    //logic: once we call the map on the nested list, we get two elements
    //List1(1,2,3,4) & List2(5,6,7,8)
    //on each list that we receive, we further map it to get individual elements and increment it
    println("Output from 2 step flattening:")
    println(flattenedMap)
    //a flat map is the combination of above i.e. map + flatten
    //in flatMap we still need to provide the map functionality
    //note the flatten happens after the map is applied
    //in essence this could be called flattenAfterMap
    flattenedMap = nestedList.flatMap(aList => aList.map(_ + 1))
    println("Flatmap with an operation on it:")
    println(flattenedMap)



  }

}
