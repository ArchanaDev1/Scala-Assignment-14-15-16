error id: scala/Double#
file:///V:/Scala%20Assignment%205/Assignment%2016/my16project/src/main/scala/Task3.scala
empty definition using pc, found symbol in pc: scala/Double#
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Double#
	 -scala/Predef.Double#

Document text:

```scala
//This is Task3 file and in this file i have to write the code of Task2 also
enum Planet(val mass: Double, val radius: Double):
  case MERCURY extends Planet(3.123, 2.1234)
  case VENUS extends Planet(4.12334, 6.1234)
  case EARTH extends Planet(5.1234, 6.56778)
  case MARS extends Planet(6.12334, 3.9672)
  case JUPITER extends Planet(1.1234, 6.12340)
  case SATURN extends Planet(5.1231, 5.234556)
  case URANUS extends Planet(8.12456, 2.89643)
  case NEPTUNE extends Planet(1.124677, 2.12345)

  def surfaceGravity: Double =
    val G = 6.67430e-11
    G * mass / (radius * radius)
```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/Double#