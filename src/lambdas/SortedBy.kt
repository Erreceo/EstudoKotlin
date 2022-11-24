package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Ana", "Pedro", "Maria", "Bia", "Gui")
    val ordenados = nomes.sortedBy { it.length }
    println(ordenados)
}