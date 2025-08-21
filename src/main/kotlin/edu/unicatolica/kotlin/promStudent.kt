package edu.unicatolica.kotlin

fun titulo(title2:String){
    println("\n" + "=".repeat(75))
    println(title2)
    println("=".repeat(75))
}

fun promedioFuncion(){

    titulo("Calculadora Promedio")

    println("Digita tu nombre")
    val name = readln()

    var nota: Double
    var totalNotas: Double = 0.0

    for (i in 1..3){
        do {
            println("Digita la nota #$i")

            nota = readln().toDouble()

            if (nota < 0 || nota > 5) {
                println("Uy viejo, la nota es inválida. Debe estar entre 0.0 y 5.0.")

            }
        }while (nota<0 || nota>5)
        totalNotas += nota
    }

    val promedio = totalNotas / 3
    println("$name, tu promedio es $promedio")
    when {
        promedio >=3 -> print("aprobo mi papacho")
        promedio <3 -> print("un patico perdio")
    }
}

fun main(){
    promedioFuncion()
}
