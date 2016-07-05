
def f(x: Int) =  x + 1

(x: Int) => x + 1
(x: Int, y: Int) => x + y
(x: Int, y: Int) => x * y


  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
  loop(a, 0)
  }
  sum(x => x * x, 3, 5)
