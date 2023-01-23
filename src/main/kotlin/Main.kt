fun main(args: Array<String>) {
    println("Hola")
    val myLambda : (String)->Int={ valor -> valor.length}
    val lambdaEjecutada: Int = myLambda("Hola platzi")
    println(lambdaEjecutada)

    val saludos = listOf("Hello","hola","ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}