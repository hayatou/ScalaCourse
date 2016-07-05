
def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else identity(a) + sumInts(a + 1, b)

def cube(x: Int): Int = x * x * x
def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

def fact(x: Int): Int = if (x == 0) 1 else x * fact(x-1)
def sumFactorials(a: Int, b: Int): Int =
  if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)

def square(x: Int): Int = x * x
def sumSquares(a: Int, b: Int): Int =
  if (a > b) 0 else square(a) + + sumSquares(a + 1, b)

sumInts(1, 3)
sumSquares(1, 3)
sumCubes(1, 3)

