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

/*Ejercicio 2
  Crea una función que dada una frase sustituyeya un carácter por otro

          Ejemplo:
  "esta frase es de ejemplo" letra a buscar "a" letra a sustituir "i" -> "esti frise es de ejemplo"*/

fun exercise2() {
    println("Sustituir en una frase un caracter")
    println("Escribe una frase")
    val texto = readlnOrNull() ?: ""
    println("Escribe el caracter que quieres sustituir")
    val sustituir = readlnOrNull() ?: ""
    println("Escribe el caracter que quieres insertar ")
    val insertar = readlnOrNull() ?: ""
    if (texto.isEmpty()) {
        println("Este texto está vacio")
    } else {
        val show = sustituirChar(texto, sustituir, insertar)
        println(show)
    }

}

fun sustituirChar(texto: String, charSustituir: String, charInsertar: String): String {
    return texto.replace(charSustituir, charInsertar)
}