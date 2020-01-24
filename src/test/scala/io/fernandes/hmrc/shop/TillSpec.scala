package io.fernandes.hmrc.shop

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TillSpec extends AnyFlatSpec with Matchers {
  "Till checkout" should "charge 0 when cart is empty" in {
      Till.checkout(Nil) shouldBe BigDecimal(0)
    }
  it should "charge 60p for 1 Apple in the cart" in  {
    Till.checkout((Seq(Apple))) shouldBe BigDecimal(0.6)
  }

  it should "charge 25p for 1 Orange in the cart" in  {
    Till.checkout((Seq(Orange))) shouldBe BigDecimal(0.25)
  }

  it should "charge £2.05 for Apple, Apple, Orange, Apple in the cart" in  {
    Till.checkout((Seq(Apple, Apple, Orange, Apple))) shouldBe BigDecimal(2.05)
  }
}
