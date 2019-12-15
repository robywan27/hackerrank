package interview_preparation_kit

object SockMerchant {
  def sockMerchant(ar: Array[Int]): Int = {
    var numPairs = 0
    val colors: Set[Int] = ar.toSet
    for (sock <- colors) {
      val n = ar.count(_ == sock)
      if (n != 1)   numPairs += n / 2
    }
    numPairs
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    
    val result = sockMerchant(ar)
    println(result)
  }
}