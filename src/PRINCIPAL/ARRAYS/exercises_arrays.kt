package PRINCIPAL.ARRAYS

/* Crea una función que dado un array de números inserte un número en una posición designada. Devuelve el nuevo array o nil en caso de que no sea posible

           Ejemplo:
   [1,2,3,4,5,6] inserta 4 en la posición 2 -> [1,2,4,3,4,5,6]*/

fun exercise1() {
    println("Añadir en un array de 6 posiciones un nuevo dato ")
    val conjunto = arrayOf(1, 2, 3, 4, 5, 6)
    println("Array original: ${conjunto.contentToString()}")   //mostrar el contenido del array
    println("Escribe el dato a insertar")
    val newDato = readlnOrNull()?.toIntOrNull() ?: 0
    println("Escribe la posicion donde se va insertar, default '2'")
    val newPosicion = readlnOrNull()?.toIntOrNull() ?: 2
    val variable = insertarInArray(conjunto, newDato, newPosicion)
    if (variable == null) println(variable) else {
        println("Array modificado: ${variable.contentToString()}")
    }

}

fun insertarInArray(
    array: Array<Int>,
    numero: Int,
    posicion: Int
): Array<Int>? {
    if (posicion < 0 || posicion > array.size) {
        return null
    }
    val newConjunto = array.toMutableList()
    newConjunto.add(posicion, numero)
    val newArray = newConjunto.toTypedArray()
    return newArray
}


/*Ejercicio 2
   Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él

   Ejemplo:
   [1,2,3,4,5,6] existe 3 -> true*/

fun exercise2() {
    println("Comprobar si existe un número dentro de un conjunto de números")
    val conjunto = listOf(1, 2, 3, 4, 5, 6)
    println("Conjunto de enteros $conjunto")
    println("Escribe un número ")
    val numberUsuario = readlnOrNull()?.toIntOrNull() ?: 0
    println(isExiste(conjunto, numberUsuario))

}

fun isExiste(lista: List<Int>, numero: Int): Boolean {
    return lista.contains(numero)
}
