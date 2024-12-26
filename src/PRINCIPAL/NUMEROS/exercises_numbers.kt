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

