def Numeros (){

println ("Numeros Negativos, Positivos y Neutro")
println ("")
println ("")
for (i <- 1 to 20){
  println ("Ingrese un numero")
  var numeros=readInt()

  if (numeros > 0 ){
    println("POSITIVO")
  }
  if ( numeros < 0 ){
    println("NEGATIVO")
  }
  if (numeros ==0){
    println("NEUTRO")
  }

}

}

def Calificaciones (){

 var baja=9999

println(" Ingrese las calificaciones ")
for( i <- 1 to 40 )
{
var calif = readInt()
      if (calif < baja){
             baja = calif;
   }
  }
println("la calificacion mas baja es ")
println (baja)
}

def Reloj(){
var h = readLine()
var m= readLine()
var s = readLine()
for(  h <- 0 to 23)
{
  for(m <- 0 to 59)
{

  for( s <- 0 to 59)
{
println (+h+":"+m+":"+s)

}
}
}
}

println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
println ("* Que opcion deseas??                                                          *")
println ("- 1.- Numeros                                                                  -")
println ("* 2.- Calificaciones                                                           *")
println ("- 3.- Reloj                                                                    -")
println ("* 4.- Expendio                                                                 *")
println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
var opcion=readInt()
println (opcion)


opcion match {

case 1=> Numeros()
case 2 => Calificaciones()
case 3 => Reloj()
case 4 => Expendio()
case default => println("Opcion Invalida")
}
println ("Hasta luego")

def Expendio (){

    println ("Expendio de Naranjas")
    println ("")
    for ( i <- 1 to 15){
      println ("Ingrese los KG de naranja comprados")
      var kg = readInt()

        if ( kg > 10){
        println("Aplica descuento del 15%")
        println("Precio del KG de la naranja")
        var precio=readFloat()
        println (precio)
        println ("Cantidad de Kg")
        var cantidad=readFloat()
        println (cantidad)
        var subtotal = cantidad*.15
        var total=cantidad - subtotal
        println ("Usted Pagara")
        println ("$"+total)

        }

      else{
        println ("No aplica descuento")
        println ("Precio del Kg de la naranja")
        var precioC=readFloat()
        println (precioC)
        println ("Cantidad de Kg")
        var cantidadC=readInt()
        println (cantidadC)
        var resultadoC = cantidadC * precioC
        println ("Usted pagara")
        println ("$"+resultadoC)

      }
    }
}
