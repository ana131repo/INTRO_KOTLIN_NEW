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

/*Ejercicio 3
Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un número dado

Ejemplo:
[1,2,3,4,5,6] número 3 -> 1*/

fun exercise3() {
    println("Conocer el numero de veces que se repite un dato(número entero) en un conjunto")
    val conjunto = listOf(1, 2, 3, 4, 5, 6, 7, 7, 6, 53, 2, 7)
    println("Conjunto de datos: $conjunto")
    println("Escribe el dato a comprobar")
    val dato = readlnOrNull()?.toIntOrNull() ?: -0
    println("El $dato se repite ${repeat(conjunto, dato)} veces ")

}

fun repeat(lista: List<Int>, dato: Int): Int {
    var contador = 0

    lista.let {
        it.forEach { element -> if (element == dato) contador++ }
    }

    return contador
}

/* Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

             Ejemplo:
     [6,2,3,4,5,1] -> [1,2,3,4,5,6]*/

fun exercise4() {
    println("Ordenar un conjunto de números enteros")
    val conjunto = arrayListOf(6, 5, 4, 3, 2, 1, 7, 9)
    println("Conjunto de datos sin ordenar: ${conjunto}")
    println("Conjunto ordenado ${ordenar(conjunto)}")

}

fun ordenar(conjunto: ArrayList<Int>): ArrayList<Int> {
    var on = true
    while (on) {
        on = false
        for (i in 0 until conjunto.size - 1) {
            if (conjunto[i] < conjunto[i + 1]) {
                val temp = conjunto[i]
                conjunto[i] = conjunto[i + 1]
                conjunto[i + 1] = temp
                on = true
            }
        }
    }
    return conjunto
}

/*Ejercicio 5
   Crea una función que dado un conjunto de String añada un nuevo elemento que se le pase y devuelva el nuevo array

           Ejemplo:
   ["aa","bb","cc","dd"] "ee"-> ["aa","bb","cc","dd","ee"]*/

fun exercise5() {
    println("Añadir un nuevo elemento a un conjunto")
    val conjunto = arrayListOf("aa", "bb", "cc", "dd")
    println("Conjunto de  datos $conjunto")
    println("Escribir el elemento a añadir")
    val elemento = readlnOrNull() ?: ""
    println("Nuevo conjunto: ${anadirElemento(conjunto, elemento)}")


}

fun anadirElemento(miLista: ArrayList<String>, anadir: String): ArrayList<String> {
    miLista.toMutableList()
    miLista.add(anadir)
    miLista.toTypedArray()
    return miLista

}

/* Ejercicio 6
    Crea una función que dado un conjunto de Int devuelva el primer número entre 1 y 1000000 que no se encuentre dentro del array

            Ejemplo:
    [1,4,3,5,2] devuelve 6
    [1,6,3,5,2] devuelve 4*/


fun exercise6() {
    val conjunto1 = listOf(1, 4, 3, 5, 2)
    val conjunto2 = listOf(1, 6, 3, 5, 2)
    println("En este conjunto $conjunto1 es el número  ${encontrar(conjunto1)}")
    println("En este conjunto $conjunto2 es el número ${encontrar(conjunto2)}")
}

fun encontrar(conjunto: List<Int>): Int {
    val max = 1000000
    for (i in 1..max) {
        if (!conjunto.contains(i)) {
            return i
        }
    }
    error("todos los números están presentes")
}


