package Lectures.OOP

object ObjectsCompanions extends /*App*/ {
  object Person{
    val Legs = 2
    def CanDeath = true

    def apply(name: String): Person = new Person(name)
  }

  class Person (val name:String){
  }

  def main(args: Array[String]): Unit = {

    println(Person.Legs)
    println(Person.CanDeath)

    val single1 = Person
    val single2 = Person
    println(s"Is singleton  ${single1 == single2}")

    val tom = new Person("Tom")
    val marta = new Person("Marta")

    println(s"Is different instances ${tom == marta}")
    println(s"builder method ${ Person("Sam") == Person.apply("Frodo")}")
  }
}
