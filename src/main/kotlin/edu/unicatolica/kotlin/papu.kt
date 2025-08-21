package edu.unicatolica.kotlin
import kotlin.random.Random
import java.lang.NumberFormatException

//fun main(){
//    print("introducir nombre:")
//    val nombre:String =readln()!!
//    print("hola $nombre")
//    print("Ahora, introduce tu edad:")
//    var edad = readLine()!!.toString()
//
//}

fun main(){

    val randomNumber: Int =Random.nextInt(1, 101)
    var attempts:Int = 3
    var assumption: Int? = null

    while (assumption != randomNumber && attempts > 0 ) {
        println("Tienes $attempts vidas para adivinar un número entre 1 y 100.")
        try {
            assumption = readln()?.toInt()
            attempts--
        } catch (e: NumberFormatException) {
            println("Eso no es un numero valido")
            continue
        }

        if (assumption != null && assumption != randomNumber) {
            if (assumption < randomNumber) {
                println("¡Muy abajo!")
            } else {
                println("¡Muy alto!")
            }
        }
    }
    if (assumption == randomNumber) {
        println("¡Felicidades! Adivinaste el numero $randomNumber.")
    } else {
        println("Te quedaste sin vidas. El numero era $randomNumber.")
    }
}


