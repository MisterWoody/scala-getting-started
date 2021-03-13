def square(x: Int): Int = x * x
val sq_2 = square(2)

def multiply(nums: Int*): Int =  {
  var product = 1
  for (num <- nums) product *= num
  product
}

//def multiply(x: Int, y: Int) = x * y
val mul_10_30 = multiply(10, 30)


val mul_10_20_30 = multiply(10, 20, 30)
val mul_x_y = multiply(10, 20)
val mul_multiple = multiply(10, 20, 30, 40, 50)
