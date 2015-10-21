
    class Catalogo {
    val productos = new Array [Producto](50)
    var cantidadProductos =0

    def agregar (producto : Producto)
    {
    productos (cantidadProductos) = producto
    cantidadProductos +=1
      }
    }

    class Producto(a: String, b: Float, c: String){
    val nombre= a
    val precio= b
    val codigo= c
    }

    main()

    def main() {
    catalogo (new Catalogo)
    }

    def catalogo(catalogo:Catalogo)
    {
    var opcion = 3
    do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
    case 1 =>{agregarProductos(catalogo)}

    case 2 => {nota(catalogo)}
    case default => println("Hasta luego...")
        }

      } while (opcion != 3)
    }

    def mostrarMenuPrincipal() {
    println ("/._./           --TIENDA--      /._./")
    println("1) *****-----Agregar productos*****-----")
    println("2) *****-----Nota*****-----")
    println("3) *****-----Salir*****-----")
        }

    def agregarProductos(catalogo:Catalogo)
     {
    var continuar = 'n'
    do {
    capturarDatosProducto(catalogo)
    mostrarCatalogoProductos(catalogo)
    println("¿Quieres Agregar Otro Producto (s/n)? ")
    continuar = readChar()
    } while (continuar == 's')
    }

    def capturarDatosProducto(catalogo:Catalogo) {
    println("Ingresa los datos del producto")
    println("Nombre: ")
    var nombre = readLine()
    println("Precio: ")
    var precio = readFloat()
    println("Código de barras: ")
    var codigo = readLine()
    catalogo.agregar(new Producto(nombre,precio,codigo))
    }

    def mostrarCatalogoProductos(catalogo:Catalogo)
    {
    println("Nombre | Precio | Código")
    for (j <- 0 to catalogo.cantidadProductos -1) {
    println(catalogo.productos(j).nombre +"|" + catalogo.productos(j).precio +"|"+ catalogo.productos(j).codigo)
      }
    }

    def nota( catalogo:Catalogo )
    {
    var totalNota=0.0
    var otro='n'
    mostrarCatalogoProductos(catalogo)
    do{
    println("Ingresa el # numero de productos: ")
    var producto=readInt()
    println("Cantidad de productos:")
    var cantidad=readInt()
    totalNota += catalogo.productos(producto - 1).precio * cantidad
    println("Agregar otro producto: (s/n) ")
    otro=readChar()
    }while(otro!='n')
    println("Total a pagar: " + totalNota)
    }
