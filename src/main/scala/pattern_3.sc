val anArray = Array(100, 200, 300)

anArray match {
  case Array(_, second, _) => println("second=" + second)
}

