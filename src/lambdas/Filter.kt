package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Maria", 9.1),
        Aluno("Gui", 8.5),
        Aluno("Ana", 9.8),
        Aluno("Rebeca", 6.7)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    println(aprovados)
}