package PRINCIPAL.CADENAS

/* Crea una función que dados 2 strings los concatene y los devuelva
   Ejemplo:
   "esta es una cadena" y "otra cadena" -> "esta es una cadenaotra cadena"*/

fun exercise1() {
    println("Concatenar dos textos")
    println("Escribe un texto")
    val texto1 = readlnOrNull() ?: ""
    println("Escribe otro texto")
    val texto2 = readlnOrNull() ?: ""
    val show = concatenar(texto1, texto2)
    println(show)

}

fun concatenar(texto1: String, texto2: String): String {
    return texto1 + texto2

}