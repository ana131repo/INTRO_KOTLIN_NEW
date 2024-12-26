package PRINCIPAL.NUMEROS

fun menuNumbers(){
    println("Selecciona el ejercicio correspondiente")
    println("******------ NUMEROS ------------******")
    println("Ejercicio [1]")
    println("Ejercicio [2]")
    println("Ejercicio [3]")
    println("Ejercicio [4]")
    println("Ejercicio [5]")
    println("Ejercicio [6]")
    println("Ejercicio [7]")
    println("Ejercicio [8]")
    println("Salir ----[9]")

}
fun inicioNumeros(){
    var opcion_usuario_numeros:Int=0
    var isOn_numeros=true

    do {
        menuNumbers()
        opcion_usuario_numeros= readlnOrNull()?.toIntOrNull()?:0
        when(opcion_usuario_numeros){
            1-> println()//exercise1()
            2-> println()//exercise2()
            3-> println()//exercise3()
            4-> println()//exercise4()
            5-> println()//exercise5()
            6-> println()// exercise6()
            7-> println() //exercise7()
            8-> println()// exercise8()
            9->{
                println("Saliendo de Ejercicios de Números")
                isOn_numeros=false

            }
            else->{
                println("Dato inválido")
            }

        }
    }while(isOn_numeros)

}