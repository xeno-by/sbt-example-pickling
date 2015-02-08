case class Person(name: String, age: Int)

object Test extends App {
  import scala.pickling.Defaults._
  import scala.pickling.json._
  println(Person("foo", 20).pickle)
}
