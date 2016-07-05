package civ.session4.higherorder

import org.specs2.mutable.Specification

class SimpleSummationSpec extends Specification{

  "FirstClassFunctions" should {
    "provide sumOfInts" in {
      SimpleSummation.sumInts(1,3) === 6
    }
    "provide sumCubes" in {
      SimpleSummation.sumCubes(1,3) === 36
    }
    "provide sumFactorials" in {
      SimpleSummation.sumFactorials(1,3) === 9
    }
  }
}
