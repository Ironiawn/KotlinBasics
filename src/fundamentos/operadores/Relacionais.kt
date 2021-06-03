package fundamentos.operadores

import java.util.*

fun main() {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial (endereços na memória iguais)
    println("Resultado com '==='  ${d1 === d2}")

    // Igualdade Estrutural (valores dos objetos são iguais)
    println("Resultado com '==' ${d1 == d2}")
    //println("Resultado com '==' ${d1.equals(d2)}")
}