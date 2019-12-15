object Solution extends App {  
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
    

  var n = readInt
  helloWorldNTimes(n)
}