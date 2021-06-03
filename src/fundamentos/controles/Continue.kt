package fundamentos.controles

fun main() {
    for(i in 1..10){
        if( i == 5){
            continue // Funções abaixo não serão executadas e o próximo indice será feito
        }
        println("Atual: $i")
    }
}