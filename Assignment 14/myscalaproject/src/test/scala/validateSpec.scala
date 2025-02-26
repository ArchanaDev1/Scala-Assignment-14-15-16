import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ValidateSpec extends AnyFlatSpec with Matchers {
  // Tests for Task1 
  "safeCast in Relationships" should "safely cast an Any type to a specific type" in {
    val anyValue: Any = "Fusionpact"
    val stringValue: Option[String] = Relationships.safeCast[String](anyValue)
    stringValue should be(Some("Fusionpact"))
  }

  it should "return None for an invalid cast in Relationships" in {
    val anyValue: Any = 23
    val stringValue: Option[String] = Relationships.safeCast[String](anyValue)
    stringValue should be(None)
  }

  it should "safely cast an Any type to an Int in Relationships" in {
    val anyValue: Any = 23
    val intValue: Option[Int] = Relationships.safeCast[Int](anyValue)
    intValue should be(Some(23))
  }

  it should "return None for an invalid cast to Int in Relationships" in {
    val anyValue: Any = "Not an Int"
    val intValue: Option[Int] = Relationships.safeCast[Int](anyValue)
    intValue should be(None)
  }

  // Tests for Task2 
  "safeCast in TypeCasting" should "safely cast an Any type to a specific type" in {
    val anyValue: Any = "Fusionpact"
    val stringValue: Option[String] = TypeCasting.safeCast[String](anyValue)
    stringValue should be(Some("Fusionpact"))
  }

  it should "return None for an invalid cast in TypeCasting" in {
    val anyValue: Any = 23
    val stringValue: Option[String] = TypeCasting.safeCast[String](anyValue)
    stringValue should be(None)
  }

  it should "safely cast an Any type to an Int in TypeCasting" in {
    val anyValue: Any = 23
    val intValue: Option[Int] = TypeCasting.safeCast[Int](anyValue)
    intValue should be(Some(23))
  }

  it should "return None for an invalid cast to Int in TypeCasting" in {
    val anyValue: Any = "Not an Int"
    val intValue: Option[Int] = TypeCasting.safeCast[Int](anyValue)
    intValue should be(None)
  }
}