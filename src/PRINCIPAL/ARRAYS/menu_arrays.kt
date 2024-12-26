package PRINCIPAL.ARRAYS

fun menuArrays(){
    println("Selecciona el ejercicio correspondiente")
    println("********   ARRAYS  -------***********")
    println("Ejercicio [1]")
    println("Ejercicio [2]")
    println("Ejercicio [3]")
    println("Ejercicio [4]")
    println("Ejercicio [5]")
    println("Ejercicio [6]")
    println("Salir ----[7]")

}
fun inicioArrays(){
    var opcion_usuario_arrays:Int
    var isOn_Arrays =true
    do {
        menuArrays()
        opcion_usuario_arrays = readlnOrNull()?.toIntOrNull()?:0
        when(opcion_usuario_arrays){
            1-> println()// exercise1()
            2-> println()//exercise2()
            3-> println()// exercise3()
            4-> println()// exercise4()
            5-> println()// exercise5()
            6-> println()// exercise6()
            7->{
                println("Saliendo de ejercicios de Arrays")
                isOn_Arrays = false


            }else-> println("Dato inválido")
        }
    }while(isOn_Arrays)
}