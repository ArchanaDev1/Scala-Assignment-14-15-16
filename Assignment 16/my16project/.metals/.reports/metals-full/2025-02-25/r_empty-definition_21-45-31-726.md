error id: `<none>`.
file:///V:/Scala%20Assignment%205/Assignment%2016/my16project/src/main/scala/Task3.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
 def getMass(planet: String): Option[Double] =
    planetData.get(planet).map(_._1)

  def getRadius(planet: String): Option[Double] =
    planetData.get(planet).map(_._2)

  // 3. Compute Surface Gravity: g = G * M / R^2
  def surfaceGravity(planet: String): Option[Double] =
    val G = 6.67430e-11 // Universal gravitational constant (m^3 kg^-1 s^-2)
    for
      (mass, radius) <- planetData.get(planet)
    yield G * mass / (radius * radius)
```

#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.