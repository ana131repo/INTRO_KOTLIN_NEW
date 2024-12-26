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
            1-> exercise1()
            2-> exercise2()
            3-> exercise3()
            4-> exercise4()
            5-> exercise5()
            6-> exercise6()
            7-> exercise7()
            8-> exercise8()
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