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
  var operacion = (cantidad)
  }
  if (a== 2)
  {
  println ("Su descuento es del 10%")
  println ("Ingrese su cantidad de compra")
  var cantidad1 = readInt()
  var operacion1 = (cantidad1*.10)
  }
  if  (a == 3)
  {
  println ("Su descuento es del 25%")
  println ("ingrese su cantidad de compra")
  var cantidad2 = readInt()
  var operacion2 = (cantidad2*.25)
  }

  if  (a == 4)
  {
  println ("Su descuento es del 50%")
  println ("Ingrese su cantidad de compra")
  var cantidad3 = readInt()
  var operacion3 = (cantidad3*.50)
  }

  if  (a==5)
  {
  println ("SU descuento es del 100%")
  println ("Su compra es gratis")
  ("Vuelva pronto!")
  }
