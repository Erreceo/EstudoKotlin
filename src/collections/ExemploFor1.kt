package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("João", "Maria", "Pedro", "Ana", "Paulo", "Raquel")
    for (aluno in alunos) {
        println(aluno)
    }
    for((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }
}