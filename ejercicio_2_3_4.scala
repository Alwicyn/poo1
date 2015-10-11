println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
println ("* Que opcion deseas??                                                          *")
println ("- 1.- Ejercicio 2                                                              -")
println ("* 2.- Ejercicio 3                                                              *")
println ("- 3.- Ejercicio 4                                                              -")
println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**")
  var opcion = readInt()
   if (opcion == 1){

  println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
  println ("* Que opcion deseas??                                                          *")
  println ("- 1.- Salario                                                                  -")
  println ("- 2.- Empresa                                                                  *")
  println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
  var opcion1=readInt()

  opcion1 match {

  case 1=> Salario()
  case 2=> Empresa()
  case default => println("Opcion Invalida")
  }
  println ("Hasta luego")

  }

  def Salario(){
  println ("SALARIO")

  println ("Ingrese las horas de trabajo")
  var a = readInt()

  if(a<=40)
  {
    var salario1=(160*a)
    println  (salario1)
  }
  else
  {
    println ("Ingrese sus horas extras")
    var b = readInt()
    var salario2=(6400+(b*120))
    println (salario2)
  }
}
def Empresa(){
println ("Fabrica de Refacciones -ROLCAR-")

println ("1.- Balatas ")
println ("2.- Llantas ")
println ("3.- Carburad " )
println ("4.- Tapones ")

println ("Ingrese la cantidad a comprar")
var a = readInt()
println (a)

if (a>500000)
{
var capital = (a*.55)
var banco = (a*.30)
var fabricante = (a*.15)

println (capital)
println (banco)
println (fabricante)
}
else
{
var capital1 = (a*.70)
var fabricante1 = (a*.30*.20+a*.30)

println (capital1)
println (fabricante1)
}

}
 if (opcion ==2){
 println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
 println ("* Que opcion deseas??                                                          *")
 println ("- 1.- Salario                                                                  -")
 println ("- 2.- Empresa                                                                  *")
 println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
 var opcion2=readInt()

 opcion2 match {

 case 1=> Tienda()
 case 2=> IMSS()
 case default => println("Opcion Invalida")
 }
 println ("Hasta luego")

 }


 def Tienda(){
 println ("Tienda de descuento")
 println ("De que color es la bolita")

 println ("1.- Bola Blanca")
 println ("2.- Bola Verde")
 println ("3.- Bola Amarilla")
 println ("4.- Bola Azul")
 println ("5.- Bola Roja")

   var a = readInt()

   if ( a == 1)
   {
   println ("Su descuento no aplica")
   println("Ingrese su cantidad de compra")
   var cantidad = readInt()
   println (cantidad)
   var operacion = (cantidad)
   println ("Cantidad a pagar")
   println (cantidad)
   }
   if (a== 2)
   {
   println ("Su descuento es del 10%")
   println ("Ingrese su cantidad de compra")
   var cantidad1 = readInt()
   println (cantidad1)
   var operacion1 = (cantidad1 * .10)
   println ("Cantidad a pagar")
   println (operacion1  - cantidad1)

   }
   if  (a == 3)
   {
   println ("Su descuento es del 25%")
   println ("ingrese su cantidad de compra")
   var cantidad2 = readInt()
   println (cantidad2)
   var operacion2 = (cantidad2*.25)
   println ("Cantidad a pagar")
   println (operacion2 - cantidad2)
   }

   if  (a == 4)
   {
   println ("Su descuento es del 50%")
   println ("Ingrese su cantidad de compra")
   var cantidad3 = readInt()
   println (cantidad3)
   var operacion3 = (cantidad3*.50)
   println ("Cantidad a pagar")
   println (operacion3 - cantidad3)
   }

   if  (a==5)
   {
   println ("SU descuento es del 100%")
   println ("Su compra es gratis")
   println("Vuelva pronto!!!")
   }

 }
 def IMSS(){
 println ("IMSS")
 println ("JUBILACIONES")
 println ("Edad")
 var a = readInt()
 println ("Empleo")
 var b = readInt()

 if (a>=60 && b<25)
 {
 println ("Cumple los requisitos")
 println ("Edad")
 }

 if (a<60 && b>25)
 {
 println ("Cumple los requisitos")
 println ("Antiguedad Joven")
 }

 if (a>60 && b>25)
 {
 println ("Cumple los requisitos")
 println ("Antiguedad Adulta")
 }

 }
  if (opcion == 3){

  println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
  println ("* Que opcion deseas??                                                          *")
  println ("- 1.- Corredor                                                                 -")
  println ("- 2.- Zoologico                                                                *")
  println ("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-EXAMEN-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
  var opcion3=readInt()

  opcion3 match {

  case 1=> Corredor()
  case 2=> Zoologico()
  case default => println("Opcion Invalida")
  }
  println ("Hasta luego")

  }



  def Corredor(){
  println ("Monitoreo de corredores")

  println ("")

      println ("Ingrese el tiempo en minutos")
      var a= readFloat()
      println (a)
      println ("Ingrese el tiempo en minutos")
      var b= readFloat()
      println (b)
      println ("Ingrese el tiempo en minutos")
      var c= readFloat()
      println (c)
      println ("Ingrese el tiempo en minutos")
      var d= readFloat()
      println (d)
      println ("Ingrese el tiempo en minutos")
      var e= readFloat()
      println (e)
      println ("Ingrese el tiempo en minutos")
      var f= readFloat()
      println (f)
      println ("Ingrese el tiempo en minutos")
      var g= readFloat()
      println (g)
      println ("Ingrese el tiempo en minutos")
      var h= readFloat()
      println (h)
      println ("Ingrese el tiempo en minutos")
      var i= readFloat()
      println (i)
      println ("Ingrese el tiempo en minutos")
      var j= readFloat()
      println (j)

      println ("Suma de sus tiempos")
      var suma = (a+b+c+d+e+f+g+h+i+j)
      println (suma)
      if (suma > 16){
      println ("El corredor no es apto ")
      }
      else{
      println ("El corredor es apto")
      }
      println ("Promedio de sus tiempos")
      var promedio = (a+b+c+d+e+f+g+h+i+j)/10
      println (promedio)
      if (promedio <= 15){
      println ("El corredor es apto")
      }
      else {
      println ("El corredor no es apto")
      }

  }
  def Zoologico(){
  println ("Zoologico")
  println ("")
  println ("1.- Elefante")
  println ("2.- Jirafa")
  println ("3.- Chimpance")
  println ("Elija uno")
  var elija=readInt()
  var nino = 0
  var joven =0
  var adulto =0

  elija match {

    case 1 => {
      println ("Elefante")
      for (i <- 1 to 20){
      println ("Edad del Elejante #"+i)
      var Edad = readFloat()
      if (Edad == 0 && Edad ==1)
      {
          nino+1

      }   else if (Edad >1 && Edad <3){
          joven +1

      }   else if (Edad >= 3){
          adulto +1

      }
    }
      var rs1 = (nino/20)*100
      var rs2 = (joven/20)*100
      var rs3 = (adulto/20)*100

      println ("Porcentajes de animales 0-1"+rs1)
      println ("Porcentajes de animales 1-3"+rs2)
      println ("Porcentajes de animales 3 a +"+rs3)

    }
    case 2 =>{
    println ("Jirafa")
    for (i<- 1 to 15){
      println ("Edad de la jirafa #"+1)
      var EdadJ = readFloat()
      if (EdadJ == 0 && EdadJ ==1){
      nino+1
      }else if (EdadJ >1 && EdadJ <3){
      joven+1
      }else if (EdadJ >= 3){
      adulto+1
      }
    }
    var rs1 = (nino/20)*100
    var rs2 = (joven/20)*100
    var rs3 = (adulto/20)*100

    println ("Porcentajes de animales 0-1"+rs1)
    println ("Porcentajes de animales 1-3"+rs2)
    println ("Porcentajes de animales 3 a +"+rs3)
    }

    case 3 => {
    println ("Chimpance")
    for (i<- 1 to 40){
      println ("Edad del chimpance #"+1)
      var EdadC = readFloat()
      if (EdadC == 0 && EdadC ==1){
      nino+1
      }else if (EdadC >1 && EdadC <3){
      joven+1
      }else if (EdadC >= 3){
      adulto+1
    }
    }
    var rs1 = (nino/20)*100
    var rs2 = (joven/20)*100
    var rs3 = (adulto/20)*100

    println ("Porcentajes de animales 0-1"+rs1)
    println ("Porcentajes de animales 1-3"+rs2)
    println ("Porcentajes de animales 3 a +"+rs3)
  }
  }

  }
