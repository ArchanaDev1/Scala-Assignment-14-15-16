error id: surfaceGravity.
file:///V:/Scala%20Assignment%205/Assignment%2016/my16project/src/test/scala/ValidateSpec.scala
empty definition using pc, found symbol in pc: surfaceGravity.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Planet.EARTH.surfaceGravity.
	 -Planet.EARTH.surfaceGravity#
	 -Planet.EARTH.surfaceGravity().
	 -scala/Predef.Planet.EARTH.surfaceGravity.
	 -scala/Predef.Planet.EARTH.surfaceGravity#
	 -scala/Predef.Planet.EARTH.surfaceGravity().

Document text:

```scala
//Validation code of the Task1 and Task2 and also Task3
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class EnumValidationTests extends AnyFunSuite with Matchers {

  // Task1 validation
  test("Day enum should contain all days of the week") {
    Day.values should contain allElementsOf Seq(
      Day.Monday, Day.Tuesday, Day.Wednesday, 
      
      Day.Thursday, Day.Friday, Day.Saturday, Day.Sunday
    )
  }

  
  private def getDayType(day: Day.Day): String = day match {
    case Day.Saturday | Day.Sunday => "Weekend"
    case _                         => "Weekday"
  }


  test("Day enum should correctly identify weekdays and weekends") {
    getDayType(Day.Monday) shouldEqual "Weekday"
    getDayType(Day.Sunday) shouldEqual "Weekend"
  }

//Task2 validation
  test("Planet enum should have correct mass and radius values") {
    Planet.EARTH.mass shouldBe 5.1234
    Planet.EARTH.radius shouldBe 6.56778
  }

  
  private def getPlanetCategory(planet: Planet): String = planet match {
    case Planet.MERCURY | Planet.VENUS | Planet.EARTH | Planet.MARS => "Terrestrial"
    case Planet.JUPITER | Planet.SATURN | Planet.URANUS | Planet.NEPTUNE => "Gas Giant"
  }
  
  test("Planet classification should correctly differentiate terrestrial and gas giants") {
    getPlanetCategory(Planet.MARS) shouldEqual "Terrestrial"
    getPlanetCategory(Planet.JUPITER) shouldEqual "Gas Giant"
  }
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: surfaceGravity.