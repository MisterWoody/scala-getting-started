def square(x: Int): Int = x * x
val sq_2 = square(2)

def multiply(x: Int, y: Int) = x * y
val mul_10_30 = multiply(10, 30)

def multiply(nums: Int*): Int =  {
  var product = 1
  for (num <- nums) product *= num
  product
}

val mul_10_20_30 = multiply(10, 20, 30)