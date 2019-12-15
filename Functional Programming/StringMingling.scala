object Solution {
  def mingleStrings(s1: String, s2: String): String = {    
    def helper(l1: List[Char], l2: List[Char]): List[Char] =
      (l1, l2) match {
        case (Nil, Nil) => Nil
        case (Nil, x) => x
        case (x, Nil) => x
        case ((x :: xs), (y :: ys)) => x :: y :: helper(xs, ys)
      }
    
    helper(s1.toList, s2.toList).mkString("")
  }

  def main(args: Array[String]) {
    /*val string1 = scala.io.StdIn.readLine()
    val string2 = scala.io.StdIn.readLine()*/
    val string1 = Console.readLine()
    val string2 = Console.readLine()
    println(mingleStrings(string1, string2))
  }
}

