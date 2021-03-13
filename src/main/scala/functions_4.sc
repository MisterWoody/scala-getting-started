def logTransaction(amount: Double,
                   debit: Boolean = true,
                   currency: String = "USD"): Unit = {
  val symbol = if(debit) "-" else "+"
  println(symbol + currency + amount)
}

logTransaction(100.25)
logTransaction(23.15)
logTransaction(89.33)

