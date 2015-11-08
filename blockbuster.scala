class Pelicula(n: String){
  val nombre=n
  var clasificacion: String = ""
  var precioPorDia: Double = 0.0

  def clasificar(c: String) {
    clasificacion = c
    clasificacion match {
      case "niños" => precioPorDia = 10
      case "estrenos" => precioPorDia = 25
      case "regular" => precioPorDia = 15
    }
  }
}

	class Renta(){
  val peliculas= new Array[PeliculaRentada](50)
  var peliculasRentadas=0
  def rentar(pelicula: Pelicula, dias: Int){
   peliculas(peliculasRentadas)= new PeliculaRentada(pelicula, dias)
   peliculasRentadas += 1
  }
  def totalAPagar(): Double = {
    var total=0.0
    for(i <-0 to peliculasRentadas - 1){
      total += peliculas(i).precio()
    }
    return total
  }
}

class PeliculaRentada(p: Pelicula, d:Int){
  val pelicula= p
  val diasRentada=d
  def precio(): Double = {
    var descuento=0.0
    pelicula.clasificacion match {
      case "ninos" => {
        if(diasRentada>=3){
        descuento=.15
        }
      }
      case "regular" =>{
        if(diasRentada>=2){
        descuento=0.1
        }
      }
      case default => descuento=0.0
    }
      var precio = pelicula.precioPorDia * diasRentada
      return precio - precio*descuento
    }
}

var respuesta='n'
val renta= new Renta()
do{
	println ("")
	println ("----------* Blockbuster *----------")
	println ("")
  val pelicula=new Pelicula("")
  println("Titulo de la pelicula que desea registar : ")
  var titulo=readLine()
	println (titulo)
  println("Le recordamos las clasificaciones que manejamos")
	 println ("Estrenos, Niños y Regular:")
  var clasificacion=readLine()
	println (clasificacion)
  println("Dias a rentar: ")
  var dias=readInt()
	println (dias)
  pelicula.clasificar(clasificacion)
  renta.rentar(pelicula, dias)

  println("Quieres rentar otra pelicula? (s/n) ")
  respuesta=readChar()

}
	while (respuesta!='n')
	println("Total a pagar: " + renta.totalAPagar())
