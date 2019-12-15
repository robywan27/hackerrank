package interview_preparation_kit

object TwoDimArray {

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    val maxRowSpan = 4
    val maxColSpan = 5    
    var max = 0

    for (i <- 0 until maxRowSpan) {      
      for (j <- 1 until maxColSpan) {
        var sum = 0
        for (k <- j - 1 to j + 1) {
          sum += arr(i)(k)        
          sum += arr(i + 2)(k) 
        }   
        sum += arr(i + 1)(j)
        if (sum > max) max = sum
      }
    }

    max
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val arr = Array.ofDim[Int](6, 6)
    for (i <- 0 until 6) {
        arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = hourglassSum(arr)
    println(result)
  }
}


/*
-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5*/
