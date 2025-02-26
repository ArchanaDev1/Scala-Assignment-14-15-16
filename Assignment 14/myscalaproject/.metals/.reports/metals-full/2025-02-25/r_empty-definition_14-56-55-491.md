error id: scala/None.
file:///V:/Scala%20Assignment%205/Assignment%2014/myscalaproject/src/main/scala/Task2.scala
empty definition using pc, found symbol in pc: scala/None.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -None.
	 -None#
	 -None().
	 -scala/Predef.None.
	 -scala/Predef.None#
	 -scala/Predef.None().

Document text:

```scala
 def safeCast[T](value: Any): Option[T] = value match {
        case v: T => Some(v)
        case _ => None
    }
```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/None.