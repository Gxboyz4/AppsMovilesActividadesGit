package com.actividades.appsmovilesactividades

/**
 * Actividad: Practica 2: Cadena fina
 * Nombre: Gabriel Mancinas
 * ID: 233410
 */
/**
Se dice que una cadena es “fina” si cumple al menos 2 de las siguientes condiciones:

 No contiene las siguientes sub cadenas: “bu”, “ba” o “be”
 Contiene al menos 3 vocales (es posible repetir las vocales)
 Contiene al menos una letra doble, es decir, la misma letra seguida de sí misma.
Por ejemplo, la cadena “abba” cumple con esta condición porque se repite b.
Se necesita implementar una función de extensión de tipo String llamada esFina() que regrese
cierto si cumple con 2 de las condiciones anteriores y falso en caso contrario.
 */
fun main(args:Array<String>){
    println("bac".esFina()) //False
    println("aza".esFina()) //False
    println("abaca".esFina()) //False
    println("baaa".esFina()) //True
    println("aaab".esFina()) //True

}
fun String.esFina(): Boolean{
    // No contiene "bu" "ba" o "be"
    val c1 = !Regex("bu|ba|be").containsMatchIn(this)
    //Contiene al menos 3 vocales
    val c2 = Regex("[aeiouAEIOU]").findAll(this).count() >= 3
    //Contiene al menos una letra doble
    val c3 = Regex("(\\w)\\1").containsMatchIn(this)

    //Cuenta los true de la lista, si hay más de 2, entonces lo regresa.
    return listOf(c1, c2, c3).count {it} >= 2
}
