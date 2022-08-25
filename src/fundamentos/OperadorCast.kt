package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as? Int ?: 0){
        10, 9 -> print("A")
        8, 7 -> print("B")
        6, 5 -> print("C")
        4, 3 -> print("D")
        2, 1, 0 -> print("E")
        else -> print("Nota inválida")
    }
}


fun main(args: Array<String>) {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5,4.1)

    for (nota in notas){
        imprimirConceito(nota.toInt())
    }
}