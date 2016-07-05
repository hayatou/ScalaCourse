import scala.annotation.tailrec

def factRec(x: Int): Int = {
  if (x == 0) 1
//  if (x == 0) throw new Exception("Rec boom!!")
  else x * factRec(x - 1)
}

def factIter(x: Int) = {
  var result = 1
  for (i <- x to 0 by -1) {
    if (i == 0) result *= 1
//    if (i == 0) throw new Exception("Iter boom!!")
    else
      result *= i
  }
//  if (x == 0) throw new Exception("Iter boom!!")
  result
}

def factTailRec(n: Int): Int = {
  @tailrec
  def loop(acc: Int, n: Int): Int = {
    if (n == 0)  acc
//    if (n == 0) throw new Exception("Tail Rec boom!!")
    else loop(acc * n, n - 1)
  }
  loop(1, n)
}

factRec(5)
factIter(5)
factTailRec(5)
