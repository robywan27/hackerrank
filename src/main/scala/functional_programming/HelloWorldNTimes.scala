package functional_programming

object HelloWorldNTimes {
  @scala.annotation.tailrec
  def helloWorldNTimes(n: Int): Unit =
    if (n == 0)   return
    else {
      println("Hello World")
      helloWorldNTimes(n - 1)
    }  

  // solution with pattern matching
  def fPattMatch(n: Int): Unit =
    n match {
      case 0 => return
      case _ => {
        println("Hello World")
        helloWorldNTimes(n - 1)
      }
    }

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt
    helloWorldNTimes(n)
  }
}