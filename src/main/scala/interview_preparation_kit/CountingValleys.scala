 package interview_preparation_kit

object CountingValleys {
  def countingValleys(n: Int, s: String): Int = {
    var altitudeLevel = 0
    var valleys = 0
    for (c <- s)
      if (c == 'D') altitudeLevel  -= 1
      else {
        altitudeLevel += 1
        if (altitudeLevel == 0)
          valleys += 1
      }
    valleys
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val s = stdin.readLine

    val result = countingValleys(n, s)
    println(result)
  }
}
