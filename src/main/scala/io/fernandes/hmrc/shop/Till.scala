package io.fernandes.hmrc.shop

object Till {
  def checkout(cart: Seq[Item])(offers: Seq[Offer] = Seq(twoForOneApples, threeForTwoOranges)): BigDecimal =
    offers.map(_.apply(cart)).sum
}
