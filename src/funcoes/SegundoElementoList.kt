package funcoes

// E = Elemento, mas pode ser qualquer nome.. até um 'ABCDE'
fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("João", "Maria", "Pedro")

    print(list.secondOrNull())

}
