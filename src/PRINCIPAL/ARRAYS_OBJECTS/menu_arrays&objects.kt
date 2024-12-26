package PRINCIPAL.ARRAYS_OBJECTS

fun menuArraysAndObjects(){
    println("Ejercicio [1]")
    println("Ejercicio [2]")
    println("Ejercicio [3]")
    println("Ejercicio [4]")
    println("Ejercicio [5]")
    println("Salir --- [6]")
}

fun inicioArraysAndObjects(){
    var opcion_usuario_arraysAndObjects:Int
    var isOn_ArraysAndObjects =true
    do{
        menuArraysAndObjects()
        opcion_usuario_arraysAndObjects = readlnOrNull()?.toIntOrNull()?:0
        when(opcion_usuario_arraysAndObjects){
            1-> println()// exercise1()
            2-> println()// exercise2()
            3-> println()// exercise3()
            4-> println()// exercise4()
            5-> println()// exercise5()
            6->{
                println("Saliendo de ejercicios de ArraysAndObjects")
                isOn_ArraysAndObjects=false
            }
            else-> println("Dato Inválido")
        }

    }while(isOn_ArraysAndObjects)

}