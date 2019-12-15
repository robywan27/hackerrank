def length(l: List[Int]): Int = l.foldLeft(0) {(acc, _) => acc + 1}
def lengthR(l: List[Int]): Int = l.foldRight(0) {(_, acc) => acc + 1}

def lengthPM(l: List[Int]): Int =
	l match {
		case Nil => 0
		case (x :: xs) => 1 + lengthPM(xs)
	}