/***
Scala has primary constructor and auxiliary constructors
Each auxiliary constructor must start with a call to a previously defined
auxiliary constructor or the primary constructor.
***/

class Person {
  private var name = ""
  private var age = 0
  def this(name: String) { // An auxiliary constructor
    this() // Calls primary constructor
    this.name = name
  }
  def this(name: String, age: Int) { // Another auxiliary constructor
    this(name) // Calls previous auxiliary constructor
    this.age = age
  }
}

