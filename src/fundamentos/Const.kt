package fundamentos

/**
 *  Constantes (val) são valores que não podem ser modificados
 *  Diferentes de variáveis (var) onde seu valor pode ser alterado em runtime
 */
fun main() {
    val a: Int = 1
    val b = 2 // Tipo inferido

    //a = a + b
    print(a)
}