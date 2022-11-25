package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "José")

//    aprovados.add(1)

    println("Sem ordem...")

    for (aprovado in aprovados) {
        aprovado.print()
    }
    val aprovados2 = linkedSetOf("João", "Maria", "Pedro", "Ana", "José")
    println("\n Linked...")
    for (aprovado in aprovados2) {
        aprovado.print()
    }

    val aprovados3 = sortedSetOf("João", "Maria", "Pedro", "Ana", "José")
    println("\n Sorted...")
    for (aprovado in aprovados3) {
        aprovado.print()
    }


    aprovados.sortedBy { it.substring(1) }.print()
}
