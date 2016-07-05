package civ.session3.helloworld

import org.specs2.Specification

class HelloWorldAcceptSpec extends Specification { def is = s2"""
  This is a specification to check 'Hello World'"""

  val hw = new HelloWorld

  def t1 = hw.getHelloWorld() === "Hello World"

}
