package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado à $chefe"
}

fun main() {
    println(relacaoDeTrabalho("João", "Maria")) // Sem explicitar parâmetros
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria")) // Explicitando parâmetros
}