package funcoes

inline  fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no método $nomeFuncao...")
    try{
        return funcao()
    }finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int = a + b

fun main() {
    var resultado = executarComLog("somar"){
        val a = somar2(4, 5)
        a + 2
    }

    println(resultado)
}