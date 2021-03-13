val aTuple = ("NZD", 100)
println(aTuple._1)
println(aTuple._2)

aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "NZD" => println("NZD " + amount * (1/1.50) )
}

