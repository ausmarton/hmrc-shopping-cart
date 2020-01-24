package io.fernandes.hmrc.shop

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ItemSpec extends AnyFlatSpec with Matchers {
  "Apples" should "cost 60p" in {
    Apple.price shouldBe BigDecimal(0.6)
  }

  "Oranges" should "cost 25p" in {
    Orange.price shouldBe BigDecimal(0.25)
  }
}
