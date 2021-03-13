val amounts = Array(10, 24, 35, 23, 12)

val result: Array[Int] = for (amount <- amounts) yield {
  amount
}
