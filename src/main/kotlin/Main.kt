fun main(args: Array<String>) {
    println("Hola")
    var contador= 10
    while (contador > 0){
        println("El valor de contador es $contador")
        contador--
    }
    do {
        println("Gernerando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    }while (numeroAleatorio > 50)
}