package com.actividades.appsmovilesactividades

/**
 * Actividad: 4.2
 * Nombre: Gabriel Mancinas
 * ID: 233410
 */

/**
Implementa una función de extensión de tipo String? Que regrese cierto si la cadena está vacía
o nula
*/

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? =""
    println(s1.esVaciaONula()==true) //Es true, ya que el método esVaciaONula regresa True
    println(s2.esVaciaONula()==true) //Es true, ya que el método esVaciaONula regresa True
    val s3 = "    "
    println(s3.esVaciaONula()==false) //Es true, ya que el método esVaciaONula regresa false, por lo tanto, s3.esVaciaONula=False y false==false es TRUE.
}
fun String?.esVaciaONula(): Boolean{
    return this==null || this.isEmpty()
    //This es la cadena.
}


