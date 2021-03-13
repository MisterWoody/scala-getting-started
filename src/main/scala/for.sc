val amounts = Array(10, 24, 35, 23, 12)
val currencies = Array("USD", "NZD")


val result: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "NZD")
} yield currency + " " + amount
