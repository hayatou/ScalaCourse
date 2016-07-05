package civ.session3.functions

import org.specs2.mutable.Specification
import scala.math._
/**
 * Created by afayyaz on 19/02/15.
 */
class MySqrtSpec extends Specification{

  "MySqrt" should {
    "return correct sqrt" in {
      val mySqrt = new MySqrt()
      abs(mySqrt.sqrt(4) - 2.0) < 0.001
    }
  }
}
