package $package$

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.sayHello shouldEqual "Hello"
  }
}
