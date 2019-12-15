package functional_programming

object UpdateList {
  def absoluteValues(arr: List[Int]): List[Int] = arr.map(x => if (x >= 0) x else -x)
}