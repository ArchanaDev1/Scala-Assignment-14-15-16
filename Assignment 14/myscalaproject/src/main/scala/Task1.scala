import scala.reflect.ClassTag

object Relationships {
    def main(args: Array[String]): Unit = {
        val intVal: Any = 23
        val doubleVal: Any = 23.33
        val floatVal: Any = 22.66f
        val byteVal: Any = 0x1.toByte
        val shortVal: Any = 0x1.toShort
        val unitVal: Any = ()
        val charVal: Any = 'A'
        val longVal: Any = 22L
        val booleanVal: Any = false

        val stringVal: Any = "Fusionpact"
        val listVal: Any = List(8, 9, 5)
        val optionVal: Any = Some(1000)
        val mapVal: Any = Map("key" -> "value")
    }
   
    def safeCast[T: ClassTag](value: Any): Option[T] = value match {
        case v: T => Some(v)
        case _ => None
    }
}