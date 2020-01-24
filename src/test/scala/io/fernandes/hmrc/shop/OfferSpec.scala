package io.fernandes.hmrc.shop

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OfferSpec extends AnyFlatSpec with Matchers {
  "No Offers" should "charge full price for one Apple" in {
    noOffers(Seq(Apple)) shouldBe Apple.price
  }

  it should "charge full price for two Apples" in {
    noOffers(Seq(Apple, Apple)) shouldBe Apple.price * 2
  }

  it should "charge full price for one Orange" in {
    noOffers(Seq(Orange)) shouldBe Orange.price
  }

  it should "charge full price for two Oranges" in {
    noOffers(Seq(Orange, Orange)) shouldBe Orange.price * 2
  }

  it should "charge full price for three Oranges" in {
    noOffers(Seq(Orange, Orange, Orange)) shouldBe Orange.price * 3
  }

  "Apples two for One" should "price of one Apple" in {
    twoForOneApples(Seq(Apple)) shouldBe Apple.price
  }

  it should "charge price of one for two apples" in {
    twoForOneApples(Seq(Apple, Apple)) shouldBe Apple.price
  }

  it should "charge price of two for three apples" in {
    twoForOneApples(Seq(Apple, Apple, Apple)) shouldBe Apple.price * 2
  }

  "Oranges three for two" should "charge price of one Orange" in {
    threeForTwoOranges(Seq(Orange)) shouldBe Orange.price
  }

  it should "charge price of two Oranges" in {
    threeForTwoOranges(Seq(Orange, Orange)) shouldBe Orange.price * 2
  }

  it should "charge price of two Oranges for three" in {
    threeForTwoOranges(Seq(Orange, Orange, Orange)) shouldBe Orange.price * 2
  }

  it should "charge price of three Oranges for four" in {
    threeForTwoOranges(Seq(Orange, Orange, Orange, Orange)) shouldBe Orange.price * 3
  }

  it should "charge price of four Oranges for five" in {
    threeForTwoOranges(Seq(Orange, Orange, Orange, Orange, Orange)) shouldBe Orange.price * 4
  }

  it should "charge price of four Oranges for six" in {
    threeForTwoOranges(Seq(Orange, Orange, Orange, Orange, Orange, Orange)) shouldBe Orange.price * 4
  }
}
