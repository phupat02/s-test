import org.scalatest._

class ListMapSpec extends FlatSpec {

  "A List" should "never has an element that has a value less than 2" in{
    val testList = List(1,2,3,4,5)
    assert(testList(2) === 3)
  }

}
