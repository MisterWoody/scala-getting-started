object Main {
  def main(args: Array[String]): Unit = {
    // Example command line arguments - money "USD 100"
    val Array(code: String, value: String) = args(0).split("\\s")
    val valueAsDouble: Double = value.toDouble
    if (!Set("CAD", "NZD").contains(code)) {
      println("Supported currencies are CAD and NZD")
      sys.exit()
    }

    val rate: Double = Utils.getRateFrom(code)
    println(args(0) + " = USD " + (rate * valueAsDouble))
  }
}

object Utils {
  private val cadToUsd: Double = 1 / 1.30
  private val nzdToUsd: Double = 1 / 1.50

  def getRateFrom(code: String): Double = {
    println("getting rate for " + code)
    code match {
      case "CAD" => cadToUsd
      case "NZD" => nzdToUsd
    }
  }
}
