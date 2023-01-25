fun main(args: Array<String>) {
    println("Hola")
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre es nulo, es $valor")
    }
    nombre = "Giuseppe"
    nombre?.let{
    valor -> println("El nombre no es nulo, es $valor")
}
}