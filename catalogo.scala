class Catalogo{
  val productos=new Array[Producto](50)
  var cantidadProducto=0
  def agregar(producto: Producto){
    productos(cantidadProducto)=producto
    cantidadProducto += 1
  }
}
