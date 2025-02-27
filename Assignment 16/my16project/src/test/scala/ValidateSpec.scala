import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class EnumValidationTests extends AnyFunSuite with Matchers {

  // Task 1
  test("Check if all days exist in the enum") {
    val allDays = Seq(
      Day.Monday, Day.Tuesday, Day.Wednesday, 
      Day.Thursday, Day.Friday, Day.Saturday, Day.Sunday
    )
    
    
    allDays.length shouldBe 7
    Day.values should contain allElementsOf allDays
  }

 
  

  private def determineDayType(day: Day.Day): String = {
    day match {
      case Day.Saturday | Day.Sunday => "Weekend"
      case _ => "Weekday"
    }
  }

  test("Validate classification of weekdays and weekends") {
    determineDayType(Day.Wednesday) shouldEqual "Weekday"
    determineDayType(Day.Saturday) shouldEqual "Weekend"
  }

  // Task 2
  test("Verify planetary mass and radius values") {
    val earthMassExpected = 5.1234
    val earthRadiusExpected = 6.56778

  
    val actualMass = Planet.EARTH.mass
    val actualRadius = Planet.EARTH.radius

    actualMass shouldBe earthMassExpected
    actualRadius shouldBe earthRadiusExpected
  }

  
  private def classifyPlanetType(planet: Planet): String = {
    if (Seq(Planet.MERCURY, Planet.VENUS, Planet.EARTH, Planet.MARS).contains(planet)) {
      "Terrestrial"
    } else if (Seq(Planet.JUPITER, Planet.SATURN, Planet.URANUS, Planet.NEPTUNE).contains(planet)) {
      "Gas Giant"
    } else {
      "Unknown"
    }
  }

  test("Ensure correct planet classification") {
    classifyPlanetType(Planet.VENUS) shouldEqual "Terrestrial"
    classifyPlanetType(Planet.NEPTUNE) shouldEqual "Gas Giant"
  }

  // Task 3: 
  test("Compute and verify surface gravity of planets") {
    val gravitationalConstant = 6.67430e-11

    
    def computeGravity(mass: Double, radius: Double): Double = {
      val radiusSquared = radius * radius
      gravitationalConstant * mass / radiusSquared
    }

    val expectedEarthGravity = computeGravity(Planet.EARTH.mass, Planet.EARTH.radius)
    val expectedMarsGravity = computeGravity(Planet.MARS.mass, Planet.MARS.radius)

    
    Planet.EARTH.surfaceGravity shouldBe (expectedEarthGravity +- 1e-9)
    Planet.MARS.surfaceGravity shouldBe (expectedMarsGravity +- 1e-9)
  }
}
