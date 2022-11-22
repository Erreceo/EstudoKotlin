package funcoes

fun imprimirNMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimirNMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun imprimirNMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimirNMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimirNMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main( args: Array<String> ) {
    imprimirNMaior1(1, 2)
    imprimirNMaior2(1, 2)
    imprimirNMaior3(1, 2)
    imprimirNMaior4(1, 2)
    imprimirNMaior5(1, 2).run { 5 > 4 }.run { println("Resultado =  $this") }
}