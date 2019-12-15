object Solution {
  def exp(x: Double, precision: Int): Double = {
    def loop(x: Double, n: Int): Double = 
      if (n == 0)  1
      else (Math.pow(x, n) / fact(n)) + loop(x, n - 1)
    
    loop(x, precision - 1) // precision up to first 10 terms, i.e. 0 to 9
  }

  def fact(n: Int): Int = if (n == 0) 1 else n * fact(n - 1)

  /*def main(args: Array[String]) {
    // older versions of Scala do not recognize StdIn
    // val stdin = scala.io.StdIn

    val n = readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = readLine.trim.toDouble
      val e = exp(x, 10)
      println(f"$e%.4f")
    }
  }*/
}
