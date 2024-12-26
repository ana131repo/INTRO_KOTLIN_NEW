package PRINCIPAL.NUMEROS

/*Ejercicio 1
Crea una función que dado 2 números enteros los sume y devuelva el resultado
Ejemplo: 2+2 -> 4
 */

fun exercise1() {
    println("Sumar dos números enteros ")
    var resultado: Int = 0
    println("Primer número")
    val number1 = readlnOrNull()?.toIntOrNull() ?: 0
    println("Segundo número")
    val number2 = readlnOrNull()?.toIntOrNull() ?: 0
    resultado = suma(number1, number2)
    println("Resultado $resultado")
}

fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}

/*Ejercicio 2
Crea una función que dado 2 números enteros los multiplique y devuelva el resultado
Ejemplo:2*2 -> 4
*/

fun exercise2() {
    println("Multiplicar dos números enteros ")
    println("Primer número")
    val number1 = readlnOrNull()?.toIntOrNull() ?: 0
    println("Segundo número")
    val number2 = readlnOrNull()?.toIntOrNull() ?: 0
    val resultado = multiplicar(number1, number2)
    println("Resultado $resultado")
}

fun multiplicar(num1: Int, num2: Int): Int {
    return num1 * num2

}

/*Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva
el resultado solo si el divisor no es 0 en caso contrario devuelve nulo
Ejemplo:
5/0 -> null
5/2 -> 2,5*/

fun exercise3() {
    var resultado: Float
    println("Didivir dos números enteros")
    println("Primer número")
    val dividendo = readlnOrNull()?.toIntOrNull() ?: 0
    println("Segundo número")
    val divisor = readlnOrNull()?.toIntOrNull() ?: 0
    if (divisor == 0) {
        println("null")
    } else {
        resultado = dividisionResultadoFloat(dividendo, divisor)
        println(resultado)
    }
}

fun dividisionResultadoFloat(num1: Int, num2: Int): Float {
    return num1.toFloat() / num2.toFloat()

}

/*Ejercicio 4
Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división. Si el divisor es 0 devuelve nulo
Ejemplo:
5/2 -> 2
   */

fun exercise4() {
    val resultado: Int
    println("Didivir dos números enteros")
    println("Primer número")
    val dividendo = readlnOrNull()?.toIntOrNull() ?: 0
    println("Segundo número")
    val divisor = readlnOrNull()?.toIntOrNull() ?: 0
    if (divisor == 0) {
        println("null")
    } else {
        resultado = dividisionResultadoInt(dividendo, divisor)
        println(resultado)
    }

}

fun dividisionResultadoInt(num1: Int, num2: Int): Int {
    return num1 / num2


}

/* Ejercicio 5
Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos que ha jugado y los que ha ganado

Ejemplo:
jugados 10 partidos ganados 9 -> 90%
    */

fun exercise5() {
    println("Calcular el porcentaje de partidos ganados")
    println("Ingresa los partidos jugados")
    val jugados = readlnOrNull()?.toIntOrNull() ?: 0
    println("Ingresa los partidos ganados")
    val ganados = readlnOrNull()?.toIntOrNull() ?: 0
    val resultado = porcentaje(jugados, ganados)
    println("jugados $jugados partidos jugados y  ganados $ganados --> $resultado%")

}

fun porcentaje(jugados: Int, ganados: Int): Int {
    return ((ganados * 100) / jugados)


}

/*Ejercicio 6
Crea una función que dados 2 números devuelva el de mayor valor
Ejemplo:
4 y 7 -> 7
  */

fun exercise6() {
    println("Escribir dos números y devolver el mayor")
    println("Escribe un número")
    val num1 = readlnOrNull()?.toIntOrNull() ?: 0
    println("Escribe un número")
    val num2 = readlnOrNull()?.toIntOrNull() ?: 0
    val resultado = valorMayor(num1, num2)
    println("El numero mayor es $resultado")


}

fun valorMayor(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }

}



