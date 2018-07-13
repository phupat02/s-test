package map

object main5 extends App {

  val l = List(1,2,3,4,5)
  println(l.map(x => x * 2))
  println(l)
  println("----------")

  def betterThanTwo(x: Int) = if (x > 2) Some(x) else None
  println(l.map(x => betterThanTwo(x)))
  println(l.flatMap(x => betterThanTwo(x)))
  println("----------")

  def modifyList(v: Int) = List(v - 1, v, v + 1)
  println(l.map(x => modifyList(x)))
  println(l.flatMap(x => modifyList(x)))
  println("----------")

  def modifyListOfList(v : Int) = List(List(v - 1, v, v + 1))
  println(l.map(x => modifyListOfList(x)))
  println(l.flatMap(x => modifyListOfList(x)))
  println("----------")

  println(l.flatMap(x => List(x, x + 0.5)))
  println(l.map(x=> List(x, x + 0.5)))
  println(l.map(modifyList))
  println("End of list")
  println("Test 2")
  println("Test 3")

}
