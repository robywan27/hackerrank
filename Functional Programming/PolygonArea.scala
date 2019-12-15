import scala.math._

object Solution {  
  def area(coords: List[(Int, Int)]): Double = {    
    val first = coords(0)
    def helper(coords: List[(Int, Int)]): Double =
      coords match {
        case Nil => 0
        case (x :: Nil) => ((x._1 * first._2) - (x._2 * first._1)) + helper(Nil)
        case (x :: y :: xs) => 
          ((x._1 * y._2) - (x._2 * y._1)) + helper(y :: xs)
      }
    helper(coords)
  }

  def module(n: Double): Double = if (n >= 0) n else -n

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
    println(module(area(coords)) / 2)
  }
}

