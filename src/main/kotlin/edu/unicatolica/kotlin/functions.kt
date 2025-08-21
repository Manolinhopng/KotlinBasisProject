package edu.unicatolica.kotlin
import kotlin.math.pow
//import kotlin.math.random
import kotlin.math.max

fun section(title:String){
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))

}

fun variablesAndTypes(){
    section("1) variables y tipos")
    val lang:String ="Kotlin"
    var counter =0

    println("val lang = $lang")
    println("val counter = $counter")

    counter += 3
    println("val counter despues de la inflacion = $counter")

}

fun conditionalsAsExpressions(n: Int){
    section("2) Conditionals as Expressions & when")

    val parity = if ( n % 2 ==0) "even" else "odd"
    println("n=$n is $parity")

    val description = when {
        n== 0 -> "Zero"
        n in 1..9 ->" one digit positive"
        n < 0 -> "negative"
        else -> "POSITIVO <=10"
    }
    println("description: $description")
}

fun loopsDemo(){
    section("3) loops for while do while")

    for (i in 1..5) print("")
}

fun main() {
    println("sesion3")
    variablesAndTypes()
    conditionalsAsExpressions(3)
}
