import scala.reflect.ClassTag

object TypeCasting {
  def safeCast[T: ClassTag](value: Any): Option[T] = value match {
    case v: T => Some(v)
    case _ => None
  }
}