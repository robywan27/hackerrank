def replicateElementsNTimes(num: Int, arr: List[Int]): List[Int] = {
  def loop(x: Int, n: Int): List[Int] =
    if (n == 0)   List()
    else x :: loop(x, n - 1)
  
  arr match {
      case List() => List()
      case (x :: xs) => loop(x, num) ++ replicateElementsNTimes(num, xs)
  }
}