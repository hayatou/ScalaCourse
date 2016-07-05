
/***
* Simple Classes and parameterless Methods
***/

class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

/*** To use this class, you construct objects and invoke methods
* in the usual way:
***/
val myCounter = new Counter // Or new Counter()
myCounter.increment()
println(myCounter.current)

/***
* You can call a parameterless method (such as current )
* with or without parentheses:
***/

myCounter.current // OK
myCounter.current() // Also OK

