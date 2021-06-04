package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()

    for(e in lista){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }

    return listaFiltrada
}

/**
 * Sem genéricos, passando diretamente o tipo de variável :)
fun filtrar(lista: List<String>, filtro: (String) -> Boolean): List<String>{
    val listaFiltrada = ArrayList<String>()

    for(e in lista){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }

    return listaFiltrada
}
*/

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}

fun main() {
    val nomes = listOf("Ana", "Pedro", "Bia", "Rebeca", "Gui")

    println(filtrar(nomes, ::comTresLetras))
}