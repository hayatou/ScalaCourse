/** *
1. The parameters of the primary constructor are placed immediately after the
class name.
*/
class Person1(val name: String, val age: Int) {
}

/** *
2. The primary constructor executes all statements in the class definition.
*/
class Person2(val name: String, val age: Int) {
  println("Just constructed another person")
  def description = name + " is " + age + " years old"
}

/** *
3. class Person(val name: String, private var age: Int)
  declares and initialize fields
  val name: String
  private var age: Int
*/

/** *
4. If a parameter without val or var is used inside at least one method,
it is object-private field
*/
class Person4(name: String, age: Int) {
  def description = name + " is " + age + " years old"
}
