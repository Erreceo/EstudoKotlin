package funcoes
fun ordernar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordernar(38, 3, 456, 8, 51, 1, 88, 73, a= 1)) {
        print("$n ")
    }
}