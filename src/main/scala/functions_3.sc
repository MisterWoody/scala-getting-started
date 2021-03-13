def greet(first: String, last: String): Unit = {
  println("Hello! " + first + ", " + last)
}

greet("Tony", "Stark")
greet("Stark", "Tony")
greet(last = "Stark", first = "Tony")

