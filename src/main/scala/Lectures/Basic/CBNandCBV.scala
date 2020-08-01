package Lectures.Basic

object CBNandCBV extends App {
  def callByName(x: => Long ) : Unit ={
    println(s"cbn 1 $x")
    println(s"cbn 2 $x")
  }

  def callByValue(x: Long) : Unit ={
    println(s"cbv 1 $x")
    println(s"cbv 2 $x")
  }

  def callWithDefParam(id: Int = 1, name: String, age: Int = 1, address: String = "unknown"): Unit = {
    println(s"Id:$id. This is: '$name', age is: '$age', address is: '$address'" )
    println(f"Id:$id. This is: '$name', age is: '$age%.22f', address is: '$address'" )
  }



  callByName(System.currentTimeMillis())
  println("***")
  callByValue(System.currentTimeMillis())
  println("***")

  callWithDefParam(name =  "test name", address = "other address")
}
