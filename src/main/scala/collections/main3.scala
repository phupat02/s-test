package collections

import scala.collection.mutable.ArrayBuffer

object main3 extends App{

  val fixedArray = new Array[Int](10)
  val scalableArray = new ArrayBuffer[Int]()

  scalableArray += 1 //add element at the end with =+
  println(scalableArray)

  scalableArray += (3,6,7) //add multiple elements
  println(scalableArray)

  val transformedArray = for (elem <- scalableArray) yield 2 * elem //transform whole array
  println(transformedArray)

  println(scalableArray.filter(_ % 2 == 0).map(2 * _)) //get element(s) that match filter condition then do the action in map for that element(s)

  val scoresMap = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8) //can't be change later
  val scoresMutableMap = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8) //can modify value in map
  val blankScoresMap = new scala.collection.mutable.HashMap[String,Int] //start a map as a blank map

  val aliceScore = scoresMap.get("Alice")
  val bobsScore = scoresMap.getOrElse("Bob", 0) //if map contains the key Bob, return the value; otherwise, return 0
  val thaiScore = scoresMap.getOrElse("Thai", 0)
  scoresMutableMap("Bob") = 8

  println("--- Map ---")
  println("Alice Score = " + aliceScore)
  println("Bob Score = " + bobsScore)
  println("Thai Score = " + thaiScore)

  scoresMutableMap("Fred") = 7

}
