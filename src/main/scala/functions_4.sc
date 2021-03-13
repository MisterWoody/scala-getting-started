def logTransaction(amount: Double,
                   debit: Boolean = true,
                   currency: String = "USD"): Unit = {
  val symbol = if(debit) "-" else "+"
  println(symbol + currency + amount)
}

logTransaction(100.25)
logTransaction(23.15)
logTransaction(89.33)
logTransaction(89.33, debit = false, "NZD")
logTransaction(89.33, currency = "CAD", debit = false)

