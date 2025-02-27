import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ValidateSpec extends AnyFlatSpec with Matchers {
  // Tests for Task1 
  "scast in Relationships" should "safely cast an Any type to a specific type" in {
    val anyValue: Any = "Fusionpact"
    val stringValue: Option[String] = Relationships.scast[String](anyValue)
    stringValue should be(Some("Fusionpact"))
  }

  it should "return None for an invalid cast in Relationships" in {
    val anyValue: Any = 23
    val stringValue: Option[String] = Relationships.scast[String](anyValue)
    stringValue should be(None)
  }

  it should "safely cast an Any type to an Int in Relationships" in {
    val anyValue: Any = 23
    val intValue: Option[Int] = Relationships.scast[Int](anyValue)
    intValue should be(Some(23))
  }

  it should "return None for an invalid cast to Int in Relationships" in {
    val anyValue: Any = "Not an Int"
    val intValue: Option[Int] = Relationships.scast[Int](anyValue)
    intValue should be(None)
  }

  // Tests for Task2 
  "safeCast in Casting" should "safely cast an Any type to a specific type" in {
    val anyValue: Any = "Fusionpact"
    val stringValue: Option[String] = Casting.scast[String](anyValue)
    stringValue should be(Some("Fusionpact"))
  }

  it should "return None for an invalid cast in Casting" in {
    val anyValue: Any = 23
    val stringValue: Option[String] = Casting.scast[String](anyValue)
    stringValue should be(None)
  }

  it should "safely cast an Any type to an Int in Casting" in {
    val anyValue: Any = 23
    val intValue: Option[Int] = Casting.scast[Int](anyValue)
    intValue should be(Some(23))
  }

  it should "return None for an invalid cast to Int in Casting" in {
    val anyValue: Any = "Not an Int"
    val intValue: Option[Int] = Casting.scast[Int](anyValue)
    intValue should be(None)
  }
}