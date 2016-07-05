
def sum(f: Int => Int, a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)
}

def sumInts(a: Int, b: Int) = sum((x:Int) => x, a, b)
def sumCubes(a: Int, b: Int) = sum((x:Int) => x * x * x, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)

sumInts(1,3)
sumCubes(1,3)
sumFactorials(1,3)