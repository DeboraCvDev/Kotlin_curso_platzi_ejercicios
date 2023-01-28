fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo","Azul","Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("la cantidad de colores es $size")
    }
}