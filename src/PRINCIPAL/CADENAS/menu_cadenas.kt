package PRINCIPAL.CADENAS

fun menuCadenas() {
    println("Selecciona el ejercicio correspondiente")
    println("********   CADENAS   -------***********")
    println("Ejercicio [1]")
    println("Ejercicio [2]")
    println("Ejercicio [3]")
    println("Ejercicio [4]")
    println("Ejercicio [5]")
    println("Ejercicio [6]")
    println("Salir ----[7]")

}

fun inicioCadenas() {
    var opcion_usuario_cadenas: Int = 0
    var isOn_cadenas = true
    do {
        menuCadenas()
        opcion_usuario_cadenas = readlnOrNull()?.toIntOrNull() ?: 0
        when (opcion_usuario_cadenas) {
            1-> println()// exercise1()
            2-> println()// exercise2()
            3-> println()// exercise3()
            4-> println()// exercise4()
            5-> println()// exercise5()
            6-> println()// exercise6()
            7-> {
                println("Saliendo de ejercicios de Cadenas")
                isOn_cadenas=false
            }

            else->{
                println("Dato invalido")

            }

        }
    } while (isOn_cadenas)
}