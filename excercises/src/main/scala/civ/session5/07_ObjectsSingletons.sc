/***
Scala has no static methods or fields.
Instead, use the object construct.
An object defines a single instance of a class with the features
that you want.
For example,
***/

object Accounts {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

Accounts.newUniqueNumber()

