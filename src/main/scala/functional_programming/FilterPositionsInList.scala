package functional_programming

object FilterPositionsInList {
  def filterElementsAtOddPosition(arr: List[Int]): List[Int] = {
    def loop(l: List[Int], c: Int): List[Int] =
      l match {
        case List() => List()
        case (x :: xs) =>
          if (c % 2 == 0) loop(xs, c + 1)
          else x :: loop(xs, c + 1)
      }

    loop(arr, 0)
  }
}