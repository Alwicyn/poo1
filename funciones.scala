def Calificaciones (){
println ("Ingrese sus calificaciones")

println ("Ingrese su primera calificacion")
var a = readFloat()

println ("Ingrese su segunda calificacion")
var b = readFloat()
println ("Ingrese su tercera calificacion")
var c = readFloat()

println("Ingrese su calificacion del examen")
var d = readFloat()

println ("Ingrese la calificacion de su proyecto")
var e = readFloat()

println ("Su promedio final es:")

var promedio = (a+b+c) / 3*.55 + (d*.30) +( e*.15)
println (promedio)

}
def Hospital (){
println("PRESUPUESTO PARA EL HOSPITAL")

println ("Ingrese el presupuesto total")
var a = readFloat()

var presupuesto1 = (a*.40)
var presupuesto2 = (a*.30)
var presupuesto3 = (a*.30)

println ("Ginecologia")
println (presupuesto1)
println ("Traumatologia")
println (presupuesto2)
println ("Pediatria")
println (presupuesto3)


}

def Empresa(){
println ("Rocket Queen Industries")

println ("Ingrese la cantidad para el capital de la primera persona")
 var a = readFloat()
println ("Ingrese la cantidad para el capital de la segunda persona")
var b = readFloat()
println ("Ingrese la cantidad para el capital de la tercera persona")
var c = readFloat()

println("El capital es")
var capital = (a+b+c)
println (capital)

println (a*.100)
println (b*.100)
println (c*.100)

}


println ("Que opcion deseas??")
println ("1.- Calificaciones")
println ("2.- Hospital")
println  ("3.- Empresa")
var opcion=readInt()
println (opcion)


opcion match {

case 1=> Calificaciones()
case 2 => Hospital()
case 3 => Empresa()
case default => println("Opcion Invalida")
}
println ("Hasta luego!!")
