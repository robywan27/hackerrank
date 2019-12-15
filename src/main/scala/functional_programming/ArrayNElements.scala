package functional_programming

object ArrayNElements {
    def buildNElementsList(num: Int) : List[Int] = List.range(1, num + 1)

    def main(args: Array[String]): Unit = {
        println(buildNElementsList(scala.io.StdIn.readInt))
    }
}