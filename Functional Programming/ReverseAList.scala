def reverseList(arr: List[Int]): List[Int] = arr.foldLeft(List[Int]()) {(acc, x) => x :: acc}

def reverseListFR(arr: List[Int]): List[Int] = arr.foldRight(List[Int]()) {(x, acc) => acc ++ List(x)}

def reverseListPM(arr: List[Int]): List[Int] =
	arr match {
		case Nil => Nil
		case (x :: xs) => fM(xs) ++ List(x)
	}