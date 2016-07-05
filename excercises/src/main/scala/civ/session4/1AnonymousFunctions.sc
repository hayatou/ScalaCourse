// defining anonymous function
(x: Int) => x + 1

// can be assigned to variable
var increase = (x: Int) => x + 1
increase(4)

// variable can be reassigned
increase = (x: Int) => x + 10
increase(4)

// Usage of anonymous functions
// List
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter((x: Int) => x > 0)

