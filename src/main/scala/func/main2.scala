package func

object main2 extends App {

  print("test")

  //function
  def abs(x: Double) = if (x >= 0) x else -x

  //function with default arguments
  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }

  //function with variable arguments
  //ex.call val s = sum(1, 4, 9, 16, 25)
  def sum(args:Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  //function without = will return nothing
  def box(s: String){
    println(s)
  }

  //exception example
  def exception_if_negative(x: Int): Unit ={
    if(x >= 0){
      print("fine")
    } else throw new IllegalArgumentException("x should not be negative")
  }



}
