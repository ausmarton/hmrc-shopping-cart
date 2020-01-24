package io.fernandes.hmrc.shop

object Till {
  def checkout(cart: Seq[Item]): BigDecimal = cart.map(_.price).sum
}
