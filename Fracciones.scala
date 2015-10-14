println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-MENU-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
println ("* Que opcion deseas??                                                        *")
println ("- 1.- Suma                                                                   -")
println ("- 2.- Multiplicacion                                                         *")
println ("- 3.- Division                                                               -")
println ("- 4.- Resta                                                                  *")
println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-MENU-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
var opcion = readInt()

if (opcion == 1){
println ("Suma")
class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def sumar(b: Racional): Racional = {
    new Racional(
      numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador
    )
  }
}
println("Numerador de la primera fraccion: ")
val n1 = readInt()
println("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

println("Numerador de la primera fraccion: ")
val n2 = readInt()
println("Denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val suma = fraccion1.sumar(fraccion2)

println(suma.numerador + "/" + suma.denominador)

}
if (opcion ==2){
  println ("Multiplicacion")
  class Racional(n: Int, d: Int) {
    val numerador = n
    val denominador = d

    def multiplicar(b: Racional): Racional = {
      new Racional(
        numerador  * denominador ,
        denominador * b.denominador
      )
    }
  }
  println("Numerador de la primera fraccion: ")
  val n1 = readInt()
  println("Denominador de la primera fraccion: ")
  val d1 = readInt()
  val fraccion1 = new Racional(n1, d1)

  println("Numerador de la primera fraccion: ")
  val n2 = readInt()
  println("Denominador de la primera fraccion: ")
  val d2 = readInt()
  val fraccion2 = new Racional(n2, d2)

  val multiplica = fraccion1.multiplicar(fraccion2)

  println(multiplica.numerador + "/" + multiplica.denominador)

}
if (opcion ==3 ){
println ("Division")
class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def dividir(b: Racional): Racional = {
    new Racional(
    numerador * b.denominador , denominador * b.numerador

    )
  }
}
println("Numerador de la primera fraccion: ")
val n1 = readInt()
println("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

println("Numerador de la primera fraccion: ")
val n2 = readInt()
println("Denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val divide = fraccion1.dividir(fraccion2)

println(divide.numerador + "/" + divide.denominador)

}
if (opcion ==4){
  println ("Resta")
  class Racional(n: Int, d: Int) {
    val numerador = n
    val denominador = d

    def restar(b: Racional): Racional = {
      new Racional(
        numerador * b.denominador - denominador * b.numerador,
        denominador * b.denominador
      )
    }
  }
  println("Numerador de la primera fraccion: ")
  val n1 = readInt()
  println("Denominador de la primera fraccion: ")
  val d1 = readInt()
  val fraccion1 = new Racional(n1, d1)

  println("Numerador de la primera fraccion: ")
  val n2 = readInt()
  println("Denominador de la primera fraccion: ")
  val d2 = readInt()
  val fraccion2 = new Racional(n2, d2)

  val resta = fraccion1.restar(fraccion2)

  println(resta.numerador + "/" + resta.denominador)
}
