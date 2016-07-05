package civ.session3.functions
import scala.math._

/**
 * Created by afayyaz on 19/02/15.
 */
class MySqrt {

  def sqrt(x: Double) = {

    val threshold = 0.001

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improveGuess(guess))

    def isGoodEnough(guess: Double) =  abs(guess * guess -x) < threshold
    def improveGuess(guess: Double) = (guess + x/guess)/2

    sqrtIter(1.0)
  }

}
