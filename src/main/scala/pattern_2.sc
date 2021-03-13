abstract class Currency

case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

val currency: Currency = CAD()
val amount = 100


currency match {
  case u: USD => println("USD " + amount)
  case c: CAD => println("CAD " + amount * (1/1.30))
  case n: NZD => println("NZD " + amount * (1/1.50))
}
