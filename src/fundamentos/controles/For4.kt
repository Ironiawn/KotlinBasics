package fundamentos.controles

fun main() {
    val Alunos = arrayListOf("André", "Carla", "Marco")

    for((indice, aluno) in Alunos.withIndex())
        println("${indice+1} - $aluno")
}