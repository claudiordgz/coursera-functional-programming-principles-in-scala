package funsets

object Main extends App {
  import FunSets._
  val s = singletonSet(1)

  val p = contains(s, 1)
  println(p)
}
