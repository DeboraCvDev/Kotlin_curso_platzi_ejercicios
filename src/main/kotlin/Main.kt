fun main(args: Array<String>) {
    println("Hola")
    val listaDeFrutas: List<String> = listOf("Manzana", "Pera", "frambuesa", "Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comemerme una fruta llamada $fruta")
    listaDeFrutas.forEach { fruta -> println("Hoy voy a comemerme una fruta nueva se llama $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas .map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}
