package example

object Main extends App {
    println("**** this is my first scala program **** ")

    val letters = List("a", "b", "c")
    val numbers = List(1,2)
    //nested for loop example
    println("nested for loop")

    for (number <- numbers) {
        for(letter <- letters) {
            println(number + "=>" + letter)
        }
    }

    //another scala way, you can pass in two generators

    println("another way of using for loops")
    for {
        number <- numbers
        letter <- letters
    } println(number + "=>" + letter)

    //for loop that yields a number
    val newNumbers = List(1,2,3,4,5)
    var newNums = for (num <- newNumbers ) yield num * 2
    println(newNums)

    //filter out in yield
    println("Yield with condition")
    newNums = for(num <- newNumbers if num % 2 == 0) yield num * 2
    println(newNums)
}
