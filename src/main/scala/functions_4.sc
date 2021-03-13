def logTransaction(amount: Double, debit: Boolean, currency: String): Unit = {
  val symbol = if(debit) "-" else "+"
  println(symbol + currency + amount)
}

logTransaction(100.25, true, "USD")
logTransaction(23.15, true, "USD")
logTransaction(89.33, true, "USD")

