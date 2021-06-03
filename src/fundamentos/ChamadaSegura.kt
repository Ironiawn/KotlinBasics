package fundamentos

fun main() {
    var a: Int? = null // ? = Safe call operator
    println(a?.dec()) // Returns only 'null'
}