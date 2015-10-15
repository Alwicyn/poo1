class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def sumar(b: Racional): Racional = {
    new Racional(numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador)
  }
  def resta (b: Racional):Racional ={
   new Racional (numerador * b.denominador - denominador * b.numerador,
     denominador * b.denominador)
  }
  def dividir(b:Racional):Racional={
  new Racional (numerador * b.denominador , denominador * b.numerador)
  }
  def multiplicar (b:Racional):Racional={
  new Racional (numerador  * denominador , denominador * b.denominador)
  }
}
println ("SUMA")
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

println ("Resta")
println ("Numerador de la primera fraccion:")
val m1 =readInt()
println ("Denominador de la primera fraccion:")
val m2 =readInt()
val fraccion3 = new Racional (m1,m2)
println ("Numerador de la primera fraccion:")
val m3=readInt()
println ("Denominador de la segunda fraccion")
val m4=readInt()
val fraccion4 = new Racional (m3,m4)

val resta = fraccion3.resta(fraccion4)
println (resta.numerador+"/"+resta.denominador)

println ("Division")
println("Numerador de la primera fraccion: ")
val N1 = readInt()
println("Denominador de la primera fraccion: ")
val D1 = readInt()
val fraccion5= new Racional(N1, D1)

println("Numerador de la primera fraccion: ")
val N2 = readInt()
println("Denominador de la primera fraccion: ")
val D2 = readInt()
val fraccion6 = new Racional(N2, D2)

val divide = fraccion5.dividir(fraccion6)

println(divide.numerador + "/" + divide.denominador)

println ("Multiplicacion")
println("Numerador de la primera fraccion: ")
val NN1 = readInt()
println("Denominador de la primera fraccion: ")
val DD1 = readInt()
val fraccion7 = new Racional(NN1, DD1)

println("Numerador de la primera fraccion: ")
val NN2 = readInt()
println("Denominador de la primera fraccion: ")
val DD2 = readInt()
val fraccion8 = new Racional(NN2, DD2)

val multiplica = fraccion7.multiplicar(fraccion8)

println(multiplica.numerador + "/" + multiplica.denominador)
