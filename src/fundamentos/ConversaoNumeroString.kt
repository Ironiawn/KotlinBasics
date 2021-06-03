package fundamentos

fun main() {
    val a = 1


    // Número para string
    println(a.toString())
    println(a.toString() + 1) // Em vez de somar irá concatenar

    // String para número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}