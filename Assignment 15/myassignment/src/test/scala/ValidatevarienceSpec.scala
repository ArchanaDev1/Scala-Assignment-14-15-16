import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TaskSpec extends AnyFlatSpec with Matchers {

  "Covariant" should "subtypes" in {
    val bird: Covariant[Bird] = new Covariant[Parrot](new Parrot)
    bird.datas.speak() should be ("parrot is flying")
  }


  "Contravariant" should "supertypes" in {
    val contravariant: Contravariant[Parrot] = new Contravariant[Bird]
    contravariant.adddata(new Parrot) 
  }

  "makeBirdFly" should "subtypes of Bird" in {
    val parrot = new Parrot
    makeBirdFly(parrot) 
  }

  "handleBird" should "supertypes of Parrot" in {
    val bird: Bird = new Parrot
    handleBird(bird) 
  }
}