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

/* Ejercicio 3
   Crea una función que dado una frase borra el carácter que se le pasa si la contiene al principio o al final de la frase

   Ejemplo:
   "esta frase es de ejemplo" caracter "o" -> "esta frase es de ejempl"*/

fun exercise3() {
    println("Eliminar un caracter al principio o al final en un texto")
    println("Escribe un frase")
    val texto = readlnOrNull() ?: ""
    println("Escribe el character a eliminar, default 'a'")
    var char = readlnOrNull() ?: "a"
    if (texto.isEmpty()) {
        println("Este texto está vácio")
    } else {
        val show = deleteChar(texto, char)
        println(show)
    }


}

fun deleteChar(texto: String, char: String): String {
    var cleanTexto = texto.trim()
    //var textoSalida = cleanTexto.startsWith(char)
    var newTexto: String = ""
    if (cleanTexto.startsWith(char)) {
        cleanTexto = cleanTexto.substring(1, cleanTexto.length)
    } else {
        cleanTexto
    }
    if (cleanTexto.endsWith(char)) {
        cleanTexto = cleanTexto.substring(0, cleanTexto.length - 1)
    } else {
        cleanTexto
    }
    return cleanTexto

}

/*Ejercicio 4
  Crea una función que dado un texto devuelva 2 veces las 2 primeras letras. Ejemplo "swift" devuelve "swsw"

  Ejemplo:
  "este es el texto" -> "eses"*/

fun exercise4() {
    println("Devolver 2 veces las 2 primeras letras de un texto")
    println("Escribe un texto")
    val texto = readlnOrNull() ?: ""
    println(duplicar(texto))

}

fun duplicar(texto: String): String {
    var dosPrimeras = texto.substring(0, 2)
    return dosPrimeras.repeat(2)
}


