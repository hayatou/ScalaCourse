
val someNumbers = List(-11, -10, -5, 0, 5, 10)

// Concising the syntax even further using PlaceHolders
someNumbers.filter( _ > 0)
someNumbers.foreach(println(_))

// Multiple Placeholders for multiple arguments
val f = (_:Int) + (_:Int)
f(1,2)
