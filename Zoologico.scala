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
