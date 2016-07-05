/** *
  * Nested classes
  */
import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
val chatter = new Network
val myFace = new Network

/***
In Scala, each instance has its own class Member , just like each
instance has its own field members . That is, chatter.Member
and myFace.Member are different classes.
you can add a member within its own network, but not across networks.
***/

val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
fred.contacts += wilma // OK
val barney = myFace.join("Barney") // Has type myFace.Member
//fred.contacts += barney
// No—can’t add a myFace.Member to a buffer of chatter.Member elements
