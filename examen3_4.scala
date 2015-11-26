class Productos  extends Iterable [ProductoAPagar] {
private val productosAPagar  = new Array[ProductoAPagar](50)
private var cantidadProductos  = 0

def iterator (): Iterator[ProductoAPagar] ={
  return productosAPagar.slice(0,cantidadProductos).iterator 
}

 def agrega (productoAPagar:ProductoAPagar){
productosAPagar (cantidadProductos)=productoAPagar
cantidadProductos += 1
}
  }   

class Nota {
private val productosAPagar = new Productos ()

def agregar( productoAPagar:ProductoAPagar){
productosAPagar.agrega(productoAPagar)
}
  
def total():Double = {
var total = 0.0
for(productoAPagar <- productosAPagar ){
total += productoAPagar.subtotal
}
return total
  }
     }


abstract class ProductoAPagar (private val nombre: String, private val precio: Float, private val cantidad: Int){
	def subtotal (): Double ={
		return precio * cantidad
	}
}

var respuesta = 'n'
val nota  = new Nota ()
do  {
	
	println ("Nombre del producto:  ")
	val nombre = readLine ()
	println (nombre)
	println ("Precio del Producto: ")
	val precio = readFloat ()
	println (precio)
	println ("Cantidad de Productos:  ")
	val cantidad = readInt ()
	println (cantidad)
	println("Desea agregar otro producto : (S/N) ")
    respuesta = readChar()
}
	while (respuesta!='n')    
	println ("Total a pagar:  " + nota.total())
	println ("Me costo :(")