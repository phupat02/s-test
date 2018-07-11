package basicandloop

object main1 {

  def main(args: Array[String]): Unit = {
    println(10 max 2)
    println(4 max 9)
    println(6 equals 2)
    println("crazy" * 3)

    val num0: Int = math.pow(2,1024).toInt
    val num1: BigInt = math.pow(2,1024).toInt
    println(num0)
    println(num1)

    println("abcdefg"(0))

    val someString: String = "abcdefg"
    println(someString(someString.length - 1))

    println("--- string take drop ---")
    println("take " + "string".take(2))
    println("drop " + "string".drop(4))
    println("takeRight " + "string".takeRight(3))
    println("dropRight " + "string".dropRight(3))

    println("")
    println("")
    println("--- chap2 ---")
    val x = 0.5
    val s = if(x > 0) 1 else -1
    println(s)
    println(if(x > 0) "positive" else -1)
    println(if(x < 0) "this have no else")
    println(if (x > 0) "this also have no else")
    println("--- loop ---")
    var r = 0
    for (i <- 1 to 5)
      r = r + 2
    println(r)
    println("--- loop 2 ---")
    for (ch <- "Hello")
      print(ch + " + ")
    println("")
    println("--- loop yield ---")
    println(for ( i <- 1 to 10) yield i % 3)
  }
}
