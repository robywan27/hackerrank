import java.io._

object Solution {    
  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    val n = a.length
    var shiftedArr: Array[Int] = Array()
    for (i <- d until n + d) {
      shiftedArr = shiftedArr :+ a(i % n)
    }    
    shiftedArr
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val nd = stdin.readLine.split(" ")
    val n = nd(0).trim.toInt
    val d = nd(1).trim.toInt
    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    
    val result = rotLeft(a, d)

    printWriter.println(result.mkString(" "))
    printWriter.close()
  }
}
