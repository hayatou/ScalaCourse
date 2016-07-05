
class Person {
  var age = 0
}

val fred = new Person
fred.age = 21

/***
 * Setters and getter are generated automatically by scala
 */

/***
* Overriding getters and setters
*/
class PrivatePerson {
  private var privateAge = 0

  def age = privateAge
  def age_=(newValue: Int) =
    if (newValue < 30) privateAge = newValue //can't get older than 30
}

val kashif = new PrivatePerson
kashif.age_=(21)
println(kashif.age)
kashif.age = 35
println(kashif.age)


/** *
  * Properties with only getters
  */
class EternalPerson {
  val age = 30
}
val p3 = new EternalPerson
p3.age

