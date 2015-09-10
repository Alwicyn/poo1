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
