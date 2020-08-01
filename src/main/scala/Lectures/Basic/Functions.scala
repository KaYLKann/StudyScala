package Lectures.Basic

import scala.annotation.tailrec

object Functions extends App {
  def aFunction(a: Int, b: String): String = {
    f"$a with $b"
  }

  def factorial(value : BigInt): BigInt ={
    if (value == 1) {
      println(f"is 1 == $value")
      value
    }
    else{
      println(f"${value} * function ${value - 1}")
      val res = value * factorial(value -1)
      println(f"result value:${value} is ${res}")
      res
    }
  }

  def fibonachi(value : BigInt) : BigInt = {
    if (value <= 2) 1
    else fibonachi(value - 1) + fibonachi(value - 2)
  }

  def tailRecFactorial(n: BigInt) : BigInt ={
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt) : BigInt ={
      if (x <= 1) {
        println(f"return ${accumulator}")

        accumulator
      } else {
        println(f"x:${x-1}, accumulator: $x * $accumulator = ${x*accumulator}")

        factorialHelper(x-1, x * accumulator)
      }
    }

    factorialHelper(n, 1)
  }

//  println(factorial(10))
  println(tailRecFactorial(50))
}
