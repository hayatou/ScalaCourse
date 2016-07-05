
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter((x: Int) => x > 0)
// Short form of Function Literals
// 1. get rid of parameter type
someNumbers.filter((x) => x > 0)
// 2. get rid of parentheses
someNumbers.filter(x => x > 0)

// Concising the syntax even further using PlaceHolders
someNumbers.filter( _ > 0)
someNumbers.foreach(println(_))

// Multiple Placeholders for multiple arguments
val f = (_:Int) + (_:Int)
f(1,2)
