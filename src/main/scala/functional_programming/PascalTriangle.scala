package functional_programming

// @TODO
object PascalTriangle {
  def pascalTriangle(n: Int): String = {
    /*def pascalTriangleHelper(n: Int, i: Int): String = {                    
      var sb = new StringBuilder("")
      if (i == n) sb.toString()
      else {      
        sb.append(loopColumns(i, 0))
        sb.append("\n")
        pascalTriangleHelper(n, i + 1)
      }
    }

    pascalTriangleHelper(n, 0)*/""
  }

  def fact(n: Int): Int = if (n == 0) 1 else n * fact(n - 1)    
    
  def loopColumns(r: Int, c: Int): String =
    if (c == r - 1) "1"
    else pascalFormula(r, c).toString + " " + loopColumns(r, c + 1)

  def pascalFormula(n: Int, r: Int): Int = fact(n) / (fact(r) * fact(n - r))

  def main(args: Array[String]) {
    val n = scala.io.StdIn.readInt()
    println(pascalTriangle(n))
  }
}

