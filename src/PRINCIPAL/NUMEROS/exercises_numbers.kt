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