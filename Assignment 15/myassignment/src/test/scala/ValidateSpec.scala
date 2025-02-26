import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Task1Spec extends AnyFlatSpec with Matchers {

  "A Container" should "store and retrieve Integers correctly" in {
    val intContainer = new Container[Int]
    intContainer.addItem(23)
    intContainer.addItem(24)
    intContainer.getItems should be (List(23, 24))
  }

  it should "store and retrieve Strings correctly" in {
    val stringContainer = new Container[String]
    stringContainer.addItem("hello")
    stringContainer.addItem("Fusionpact")
    stringContainer.getItems should be (List("hello", "Fusionpact"))
  }

  it should "store and retrieve custom objects correctly" in {
    case class Person(name: String, age: Int)
    val personContainer = new Container[Person]
    val person1 = Person("Archana", 23)
    val person2 = Person("Anshu", 25)
    personContainer.addItem(person1)
    personContainer.addItem(person2)
    personContainer.getItems should be (List(person1, person2))
  }
}