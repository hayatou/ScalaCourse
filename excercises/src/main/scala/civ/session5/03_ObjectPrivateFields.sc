/** *
In Scala (as well as in Java or C++), a method can access the private fields of all objects of its class. For example,
*/
class Counter1 {
  private var value = 0
  def increment() { value += 1 }
  def isLess(other : Counter1) = value < other.value
}

/** *
Accessing other.value is legal because other is also a Counter object.
Scala allows an even more severe access restriction, with the private[this] qualifier:
*/

class Counter2 {
  private[this] var value = 0 // Accessing someObject.value is not allowed
  def increment() { value += 1 }
//  def isLess(other : Counter2) = value < other.value
}


/** *
Now, the methods of the Counter class can only access the value field
of the current object, not of other objects of type Counter . This access
is sometimes called object-private
With a class-private field, Scala generates private getter and setter
methods. However, for an object-private field, no getters and setters
are generated at all.
*/

