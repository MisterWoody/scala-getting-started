var amount = 1000


val result: String = amount match {
  case a if a == 50 => "Bill is == 50, it's " + a
  case a if a == 100 => "bill is $100"
  case a => "The amount is " + a
}
