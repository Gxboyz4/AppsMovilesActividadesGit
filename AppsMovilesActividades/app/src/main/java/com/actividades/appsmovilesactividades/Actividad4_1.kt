package com.actividades.appsmovilesactividades
/**
 * Actividad: 4.1
 * Nombre: Gabriel Mancinas
 * ID: 233410
 */

/**
Cambia la función de suma para que sea una extensión de tipo List<Int>
fun main(args: Array<String>) {
val sum = sum(listOf(1,2,3))
println(sum)  // 6
}
fun suma(list: List<Int>): Int{
var result = 0
for (i in result){
result +=i
}
return result
}
 */

//Funciones cambiadas
fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).suma()
    println(sum)  // 6
}

fun List<Int>.suma(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}
