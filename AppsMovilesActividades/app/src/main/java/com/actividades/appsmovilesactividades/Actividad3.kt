package com.actividades.appsmovilesactividades

fun main(args: Array<String>) {
    println(validacion("nombre")) // true
    println(validacion("_nombre")) // true
    println(validacion("_12")) // true
    println(validacion("")) // false
    println(validacion("012")) // false
    println(validacion("no$")) // false
}
fun validacion(cadena: String): Boolean{
    if(cadena.isEmpty()){
        return false
    }
    if(!(cadena.get(0).isLetter() or cadena.get(0).equals('_'))){
        return false
    }
    for (i in cadena) {
        if(!(i.isLetterOrDigit() or i.equals('_'))){
            return false
        }
    }
    return true
}
