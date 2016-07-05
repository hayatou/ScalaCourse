//def sum(f: Int => Int, a: Int, b: Int): Int = {
//  if (a > b) 0
//  else f(a) + sum(f, a + 1, b)
//}
def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}
//def sumInts(a: Int, b: Int) = sum(x => x, a, b)
//def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
//def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
def sumInts = sum(x => x)
def sumCubes = sum(x => x * x * x)
def sumFactorials = sum(fact)
def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)
sumInts(1,3)
sumCubes(1,3)
sumFactorials(1,3)
// We can get rid of intermediate functions
sum(x => x)(1, 3)
// Function application associates to the left
// that means
sum(x=>x)(1,3) == (sum(x=>x))(1, 3)
//--------------------------------Multiple parameter List
// The definition of function that returns functions is so
// useful in functional programming that there is a special
// syntax for it in Scala.
// For example, the following definition of sum is equivalent
// to the one with the nested sumF function, but shorter:
def sum2(f: (Int,Int) => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a,b) + sum2(f)(a + 1, b)

// usage of multiple parameters
def id = (x:Int) => x
sum2(_*_)(1,3)
