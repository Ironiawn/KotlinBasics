package funcoes

inline fun transacao(funcao: () -> Unit){
    println("abrindo transacao...")
    try{
        funcao()
    }finally{
        println("fechando transacao")
    }
}

fun main() {
    transacao{
        for (i in 1..3) {
            println("Executando SQL $i...")
        }
    }

    /*
    transacao({
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    })*/
}