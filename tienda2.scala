var nombres = new Array[String](50)
var precios = new Array [Float](50)
var codigos = new Array [String](50)

var opcion =3
var i=0

  catalogo()
  def catalogo (){
      println("-------------------------------------Tienda-------------------------------------")
    do{
      mostrarMenuPrincipal()
      opcion = readInt()
      opcion match {

      case 1=>agregarProductos()
      case 2=>Pagar()
      case default => println ("Adios...!")
      }
    } while (opcion != 3)
  }

  def mostrarMenuPrincipal(){
  println("1) Agregar Productos")
  println ("2) Pagar")
  println ("3) Salir")
  }
  def agregarProductos(){
  var continuar = 'N'
  do{
    i+=1
    capturarDatosProducto()
    mostrarCatalogoProductos()
    println("Quieres agragar otro producto? (S/N)")
    continuar = readChar()

    }while (continuar =='S')
  }

  def capturarDatosProducto(){
    println ("Ingresa los datos del producto")
    println ("Nombre")
    nombres(i)=readLine()
    println ("Precio")
    precios(i)=readFloat()
    println ("Codigo de barras")
    codigos(i)=readLine()
  }

  def mostrarCatalogoProductos(){
  println("|---Nombre---|---Precio---|--- Codigo---|")
  for (j<- 1 to i){
  println (nombres(j)+"---|---"+precios(j)+"---|---"+codigos(j))
  }
  }

  def Pagar(){
    var conti = 'N'
    do{
    println(mostrarCatalogoProductos)
    println ("")

    println ("Precio del producto")
    var preciop=readFloat()
    println (preciop)
    println ("Con cuanto va a pagar?")
    var pagar=readInt()
    println (pagar)
    if (pagar <= 0 || pagar<preciop)
    println ("Pague con una denominacion mas alta")
    else
      println ("Su cambio es de :")
      println(preciop-pagar)
      println ("Quiere pagar algun otro producto (S/N)")
      conti = readChar()
    }while (conti =='S')

    }
