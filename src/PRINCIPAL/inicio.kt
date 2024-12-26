package PRINCIPAL

import PRINCIPAL.ARRAYS.inicioArrays
import PRINCIPAL.ARRAYS_OBJECTS.inicioArraysAndObjects
import PRINCIPAL.CADENAS.inicioCadenas
import PRINCIPAL.NUMEROS.inicioNumeros

fun main() {
    inicio()
}

fun inicio() {
    var opcionUsuario: Int = 0
    var isOn = true
    do {

        menu()
        opcionUsuario = readlnOrNull()?.toIntOrNull() ?: 0
        when (opcionUsuario) {
            1 -> inicioNumeros()
            2 -> inicioCadenas()
            3 -> inicioArrays()
            4 -> inicioArraysAndObjects()
            5 -> {
                println("Cerrando programa")
                isOn = false
            }

            else -> {
                println("Dato inválido")
            }
        }

    } while (isOn)


}

fun menu() {
    println("-----------*****-----------*****-----------")
    println("Menú de ejercicios de Introducción a Kotlin")
    println("-------------------------------------------")
    println("Números ----------[1]")
    println("Cadenas ----------[2]")
    println("Arrays------------[3]")
    println("Arrays & Objects -[4]")
    println("Salir ------------[5]")
    println(" ")
    println("Escoge una opción para empezar ")

}
