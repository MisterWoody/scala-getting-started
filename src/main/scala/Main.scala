object Main {
  def main(args: Array[String]): Unit = {
    // Example command line arguments - money "USD 100"
    val Array(code: String, value: String) = args(0).split("\\s")
    val valueAsDouble: Double = value.toDouble
    if (!Set("CAD", "NZD").contains(code)) {
      println("Supported currencies are CAD and NZD")
      sys.exit()
    }

    val utils: Utils = new Utils()


    val rate: Double = ???
    println(args(0) + " = USD " + (rate * valueAsDouble))
  }
}

class Utils {
  private val cadToUsd: Double = 1 / 1.30
  private val nzdToUsd: Double = 1 / 1.50
}
