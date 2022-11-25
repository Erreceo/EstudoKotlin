package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val strings = arrayListOf("Raquel", "Pedro", "Maria", "João", "Ana", "Paulo")
    val uniao = numeros + strings // sobrecarga de operadores

    for (item in uniao) {
        println(item)
    }
}