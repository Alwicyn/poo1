println ("Fabrica de Refacciones -ROLCAR-")

println ("Ingrese la cantidad a comprar")
var a = readInt()

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
