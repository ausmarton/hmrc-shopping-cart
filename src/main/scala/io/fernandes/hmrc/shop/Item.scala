package io.fernandes.hmrc.shop

sealed trait Item {
  def price: BigDecimal
}

case object Apple extends Item {
  override def price: BigDecimal = BigDecimal(0.6)
}

case object Orange extends Item {
  override def price: BigDecimal = BigDecimal(0.25)
}