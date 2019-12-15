object Solution extends App {
    def buildNElementsList(num: Int) : List[Int] = {        
        val list = List.range(1, num + 1)

        print(list + "\n")
        return list
    }

    println(buildNElementsList(readInt))
}