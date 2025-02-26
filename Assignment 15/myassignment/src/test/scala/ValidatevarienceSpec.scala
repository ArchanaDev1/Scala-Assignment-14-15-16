import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TaskSpec extends AnyFlatSpec with Matchers {

  "Covariant" should "allow subtypes" in {
    val bird: Covariant[Bird] = new Covariant[Parrot](new Parrot)
    bird.items.speak() should be ("parrot is speaking")
  }

  "Contravariant" should "allow supertypes" in {
    val contravariant: Contravariant[Parrot] = new Contravariant[Bird]
    contravariant.addItem(new Parrot) 
  }

  "makeBirdSpeak" should "accept subtypes of Bird" in {
    val parrot = new Parrot
    makeBirdSpeak(parrot) 
  }

  "handleBird" should "accept supertypes of Parrot" in {
    val bird: Bird = new Parrot
    handleBird(bird) 
  }
}