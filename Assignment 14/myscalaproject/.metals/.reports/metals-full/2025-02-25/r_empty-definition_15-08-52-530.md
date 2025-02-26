error id: scala/reflect/ClassTag#
file:///V:/Scala%20Assignment%205/Assignment%2014/myscalaproject/src/main/scala/Task2.scala
empty definition using pc, found symbol in pc: scala/reflect/ClassTag#
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -scala/reflect/ClassTag#
	 -ClassTag#
	 -scala/Predef.ClassTag#

Document text:

```scala
import scala.reflect.ClassTag

object TypeCasting {
  def safeCast[T: ClassTag](value: Any): Option[T] = value match {
    case v: T => Some(v)
    case _ => None
  }
}
```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/reflect/ClassTag#