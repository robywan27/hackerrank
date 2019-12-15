package functional_programming

object FilterArray {
  def filterIfSmallerThan(delim: Int, arr: List[Int]): List[Int] = arr.filter(_ < delim)
}
