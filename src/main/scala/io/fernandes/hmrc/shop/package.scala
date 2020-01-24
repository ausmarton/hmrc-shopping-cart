package io.fernandes.hmrc

package object shop {
  type Offer = Seq[Item] => BigDecimal

  private def simpleOffer(items: Int, forThePriceOf: Int): Offer =
    _.grouped(items).map(_.take(forThePriceOf).map(_.price).sum).sum

  val noOffers: Offer = simpleOffer(1, forThePriceOf = 1)

  val twoForOneApples: Offer = simpleOffer(2, forThePriceOf = 1).compose(_.filter(_ == Apple))

  val threeForTwoOranges: Offer = simpleOffer(3, forThePriceOf = 2).compose(_.filter(_ == Orange))
}
