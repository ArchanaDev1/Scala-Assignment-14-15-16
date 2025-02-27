def makeBirdFly[A <: Bird](bird: A): Unit = {
  bird.speak()
}

def handleBird[T >: Parrot](bird: T): Unit = {
  println("Handling bird")
}