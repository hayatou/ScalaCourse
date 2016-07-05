package civ.session4.higherorder

import org.specs2.mutable.Specification

class HigherOrderSummationSpec extends Specification{

  "FirstClassFunctions" should {
    "provide sumOfInts" in {
      HigherOrderSummation.sumInts(1,3) === 6
    }
    "provide sumCubes" in {
      HigherOrderSummation.sumCubes(1,3) === 36
    }
    "provide sumFactorials" in {
      HigherOrderSummation.sumFactorials(1,3) === 9
    }
  }
}
