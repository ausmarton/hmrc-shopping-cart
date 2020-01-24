package io.fernandes.hmrc.shop

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TillSpec extends AnyFlatSpec with Matchers {
  "Till checkout (with no offers)" should "charge 0 when cart is empty" in {
      Till.checkout(Nil)(Seq(noOffers)) shouldBe BigDecimal(0)
    }
  it should "charge 60p for 1 Apple in the cart" in  {
    Till.checkout((Seq(Apple)))(Seq(noOffers)) shouldBe BigDecimal(0.6)
  }

  it should "charge 25p for 1 Orange in the cart" in  {
    Till.checkout((Seq(Orange)))(Seq(noOffers)) shouldBe BigDecimal(0.25)
  }

  it should "charge £2.05 for Apple, Apple, Orange, Apple in the cart" in  {
    Till.checkout((Seq(Apple, Apple, Orange, Apple)))(Seq(noOffers)) shouldBe BigDecimal(2.05)
  }

  "Till checkout (with offers)" should "charge 0 when cart is empty" in {
    Till.checkout(Nil)() shouldBe BigDecimal(0)
  }

  it should "charge 60p for 1 Apple in the cart" in  {
    Till.checkout((Seq(Apple)))() shouldBe BigDecimal(0.6)
  }

  it should "charge 60p for 2 Apples in the cart" in  {
    Till.checkout((Seq(Apple, Apple)))() shouldBe BigDecimal(0.6)
  }

  it should "charge 120p for 3 Apples in the cart" in  {
    Till.checkout((Seq(Apple, Apple, Apple)))() shouldBe BigDecimal(1.2)
  }

  it should "charge 25p for 1 Orange in the cart" in  {
    Till.checkout((Seq(Orange)))() shouldBe BigDecimal(0.25)
  }

  it should "charge 50p for 2 Oranges in the cart" in  {
    Till.checkout((Seq(Orange, Orange)))() shouldBe BigDecimal(0.5)
  }

  it should "charge 50p for 3 Oranges in the cart" in  {
    Till.checkout((Seq(Orange, Orange, Orange)))() shouldBe BigDecimal(0.5)
  }

  it should "charge 75p for 4 Oranges in the cart" in  {
    Till.checkout((Seq(Orange, Orange, Orange, Orange)))() shouldBe BigDecimal(0.75)
  }

  it should "charge £1.45 for Apple, Apple, Orange, Apple in the cart" in  {
    Till.checkout((Seq(Apple, Apple, Orange, Apple)))() shouldBe BigDecimal(1.45)
  }

  it should "charge £1.70 for Apple, Apple, Orange, Apple in the cart" in  {
    Till.checkout((Seq(Apple, Apple, Orange, Apple, Orange, Orange)))() shouldBe BigDecimal(1.7)
  }
}
