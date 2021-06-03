package fundamentos.operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2

    num1++
    println(num1)
    --num1
    println(num1)

    /*
    Incremento e decremento
    evite o código abaixo, rs
    */
    println(++num1 == num2--) // true! exp: o num1 será incrementado antes da comparação
    println(num1 == num2)
}

