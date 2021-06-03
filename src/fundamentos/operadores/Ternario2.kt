package fundamentos.operadores

fun main() {
    println(obterResultado(6.3))
}

fun obterResultado(nota: Double) : String = if(nota >= 7) "Passou" else "Reprovado"

