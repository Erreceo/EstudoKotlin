package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Maria", "Gui", "Ana", "Rebeca")
    alunos.map { it.toUpperCase() }.sortedBy { it }.apply { println(this) }

}