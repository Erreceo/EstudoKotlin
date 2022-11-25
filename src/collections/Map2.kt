package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "João", 2 to "Maria", 3 to "Pedro")

    for ((chave, valor) in map) {
        println("$chave - $valor")
    }
}