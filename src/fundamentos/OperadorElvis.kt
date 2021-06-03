package fundamentos

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor padrão" // Caso o valor for nulo a segunda opção será exibida

    println(obrigatorio)
}