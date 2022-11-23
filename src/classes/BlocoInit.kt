package classes

class Filme3(nome:String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("O Poderoso Chefão", 1972, "Drama")
    println("O nome do filme é ${filme.nome}")
    println("O ano de lançamento é ${filme.anoLancamento}")
    println("O gênero é ${filme.genero}")
}