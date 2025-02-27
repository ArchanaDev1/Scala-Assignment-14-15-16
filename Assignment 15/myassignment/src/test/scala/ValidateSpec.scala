import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Task1Spec extends AnyFlatSpec with Matchers {

  "A Container" should "check Integers correctly" in {
    val intContainer = new Container[Int]
    intContainer.adddata(23)
    intContainer.adddata(24)
    intContainer.getdata should be (List(23, 24))
  }

  it should "check Strings correctly" in {
    val stringContainer = new Container[String]
    stringContainer.adddata("hello")
    stringContainer.adddata("Fusionpact")
    stringContainer.getdata should be (List("hello", "Fusionpact"))
  }

  it should "Check custom objects" in {
    case class Person(name: String, age: Int)
    val personContainer = new Container[Person]
    val person1 = Person("Archana", 23)
    val person2 = Person("Anshu", 24)
    personContainer.adddata(person1)
    personContainer.adddata(person2)
    personContainer.getdata should be (List(person1, person2))
  }
}