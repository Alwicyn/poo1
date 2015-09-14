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
  ("Vuelva pronto!!!")
  }
