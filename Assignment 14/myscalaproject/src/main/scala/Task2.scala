import scala.reflect.ClassTag

object Casting {
  def scast[T: ClassTag](value: Any): Option[T] = value match {
    case v: T => Some(v)
    case _ => None
  }
}