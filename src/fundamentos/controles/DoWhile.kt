package fundamentos.controles

fun main() {
    var opcao: Int = 0

    do{
        val line = readLine() ?: "0"

        opcao = line.toIntOrNull() ?: 0

        println("Você escolhei a opção $opcao")
    }while(opcao != -1)

    println("Até a próxima")
}