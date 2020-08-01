package Lectures.OOP
import scala.language.postfixOps

object MethodsNotations extends App {
  class Person(val name:String, favoriteMovie: String, val age:Int){
    def this(name : String, favoriteMovie: String) = this(name, favoriteMovie,0)

    def likes(movieName: String) = movieName == favoriteMovie

    def + (person: Person) = s"${this.name} is handing out with ${person.name}"
    def + (forConcatNickName: String) = new Person(s"${this.name} ${forConcatNickName}", this.favoriteMovie)

    def unary_+ :Person = new Person(this.name, this.favoriteMovie, this.age + 1)
    def isAlive:Boolean = true

    def apply() = s"Hi i'm ${this.name}, i like ${this.favoriteMovie}"
  }

  val tom = new Person("Tom", "LOTR")
  val marta = new Person("Marta", "Friends")

  println(tom.name)
  println(tom name)

  println(tom.likes("LOTR"))
  println(tom likes "Interceptions")

  println(tom + marta)
  println(tom.+(marta))

  println(tom())
  println(marta())

  println(s"Tom is alive: ${tom isAlive}")

  println((tom + "Some Nick Name") () )

  var moreOldTom = +tom
  moreOldTom = +moreOldTom
  moreOldTom = +moreOldTom
  moreOldTom = +moreOldTom
  var soOldTom = +moreOldTom //5 age

  println(soOldTom.age)
}
