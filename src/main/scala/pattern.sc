var amount = 1001


amount match {
  case a if a == 50 => println ("Bill is == 50, it's " + a)
  case a if a == 100 => println("bill is $100")
  case a => println("The amount is " + a)
}

