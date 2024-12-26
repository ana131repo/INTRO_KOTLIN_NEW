package PRINCIPAL.ARRAYS_OBJECTS

/* Ejercicio 1
    Crea las clases necesarias para definir clases y alumnos y añade.
     Crea 1 array con 2 clases con 10 alumnos cada una con valores de ejemplo*/

class Alumno(
    val id: Int,
    val nombre: String,
    var edad: Int,
    var nota: Float

) {
    var isAproved: Boolean = true
    var isProgresing = alumnoSuspenso()
    var needHelp: Boolean = !isAproved && !isProgresing

    fun alumnoSuspenso(): Boolean {
        return (nota < 5)
    }


}

class Aula(
    val id: String,
    var alumnos: ArrayList<Alumno>

) {


    fun addAlumno(persona: Alumno) {
        alumnos.add(persona)

    }


}

val alumnosA: ArrayList<Alumno> = arrayListOf()
val alumnosB: ArrayList<Alumno> = arrayListOf()
val aulaA = Aula("A", alumnosA)
val aulaB = Aula("B", alumnosB)
val conjunto = mutableListOf(aulaA, aulaB)


fun exercise1() {


    println("Cuantos alumnos  se van ingresar, default '4'")
    val cantidad_Alumnos = readlnOrNull()?.toIntOrNull() ?: 4
    var contador_Alumnos = 0


    do {
        println("Nombre del alumnos")
        val nombre = readlnOrNull() ?: ""
        println("Edad")
        val edad = readlnOrNull()?.toIntOrNull() ?: 0
        println("Escribe la nota")
        val nota = readlnOrNull()?.toFloatOrNull() ?: 0f
        println("Selección del aula: A/B")
        val tipoAula = readlnOrNull() ?: ""
        contador_Alumnos++
        val persona = Alumno(contador_Alumnos, nombre, edad, nota)
        if (tipoAula == "A") {
            aulaA.addAlumno(persona)
        } else {
            aulaB.addAlumno(persona)
        }

        println("Hay espacio para ${cantidad_Alumnos - contador_Alumnos}")

    } while (contador_Alumnos < cantidad_Alumnos)


}

/*ejercicio2
    Imprime por consola todos los alumnos cuyo nombre contiene "a" en cada una de las clases*/

fun exercise2() {
    println("Mostrar todos los alumnos que contengan la A")
    showExercise2(conjunto)
}

fun showExercise2(conjunto: MutableList<Aula>) {
    conjunto.forEach {
        if (it.alumnos.isEmpty()) println("No hay alumnos")
        else {
            (it.alumnos.forEach { alumno ->
                if (alumno.nombre.contains("a", ignoreCase = true))
                    println(alumno.nombre)
            })
        }

    }

}

