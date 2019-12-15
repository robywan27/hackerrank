// import java.io._

object Solution {    
  def sockMerchant(ar: Array[Int]): Int = {
    var numPairs = 0
    val colors: Set[Int] = ar.toSet
    for (sock <- colors) {
      val n = ar.filter(_ == sock).length
      if (n != 1)   numPairs += n / 2
    }
    numPairs
  }

  def main(args: Array[String]) {
    // val stdin = scala.io.StdIn
    val stdin = Console
    // val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))    
    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    
    val result = sockMerchant(ar)

    // printWriter.println(result)
    println(result)
    // printWriter.close()
  }
}