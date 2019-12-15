package interview_preparation_kit

object RepeatedString {
  def repeatedString(s: String, n: Long): Long = {    
    var numberOfAs: Long = 0    
    val patternLength = s.length
    val numberOfRepeatedFullPattern = n / patternLength
    numberOfAs += "a".r.findAllIn(s).length * numberOfRepeatedFullPattern
    
    val numberOfRemainingLetters = (n % patternLength).toInt    
    if (numberOfRemainingLetters != 0) {
      val remainingLetters = s.substring(0, numberOfRemainingLetters)
      numberOfAs += "a".r.findAllIn(remainingLetters).length
    }
    
    numberOfAs
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val s = stdin.readLine
    val n = stdin.readLine.trim.toLong

    val result = repeatedString(s, n)
    println(result)
  }
}
