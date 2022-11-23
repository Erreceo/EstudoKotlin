package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("O Poderoso Chefão", 1972, "Drama")
    println("O nome do filme é ${filme.nome}")
    println("O ano de lançamento é ${filme.anoLancamento}")
    println("O gênero é ${filme.genero}")
}