package civ.session3.helloworld

import org.specs2.mutable.Specification

class HelloWorldSpec extends Specification{
  "HelloWorld" should {
    "provides getHelloWorld which returns 'HelloWorld' string" in {
      val hw = new HelloWorld()
      hw.getHelloWorld() === "HelloWorld!!!"
    }
  }
}
