package $organization$.$name$

import org.specs2.mutable._

class $name;format="Camel"$WebSpec extends Specification {
	
	"Hello" should {
		"match 5 characters" in {
			"hello".length must equalTo(5)
		}
	}
	
}
