import scala.math._

object Solution {  
  def segments(coords: List[(Int, Int)]): List[Double] = {
    def segment(c1: (Int, Int), c2: (Int, Int)): Double = {
      def sqr(n: Int): Int = n * n
      sqrt(sqr(c2._1 - c1._1) + sqr(c2._2 - c1._2))
    }

    val first = coords(0)
    def helper(coords: List[(Int, Int)]): List[Double] =
      coords match {
        case Nil => Nil
        case (x :: Nil) => segment(x, first) :: helper(Nil)
        case (x :: y :: xs) => segment(x, y) :: helper(y :: xs)    
      }
    helper(coords)
  }

  def perimeter(segments: List[Double]): Double = segments.sum

  def makeCoordPairs(es: List[Int]): List[(Int, Int)] =
    es match {
      case Nil => Nil
      case (x :: y :: xs) => (x, y) :: makeCoordPairs(xs)
    }  
  
  def main(args: Array[String]) {
    // val stdin = scala.io.StdIn
    // val n = stdin.readInt()
    val n = Console.readInt()

    var buffer = new scala.collection.mutable.ListBuffer[Int]()
    for (i <- 1 to n) {
      // var line = stdin.readLine()
      var line = Console.readLine()
      line.split(" ").map(_.toInt).foreach { buffer += _ }
    }
    val coords = makeCoordPairs(buffer.toList)
    println(perimeter(segments(coords)))
  }
}

