def square(n: Int): Int = n * n // Int => Int

def cube(n: Int): Int = n * n * n // Int => Int

def sum(a: Int, b: Int): Int = a + b // (Int, Int) => Int

def length(a: String): Int = a.length // String => Int

def transform(f: Int => Int, numbers: Int*) = numbers.map(f)

transform(square, 1, 2, 3, 4)

transform(cube, 1, 2, 3, 4)

transform((n: Int) => n * n, 1, 2, 3, 4, 5)