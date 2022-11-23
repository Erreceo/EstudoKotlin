package classes

class Pessoa1 (var nome: String)
class Pessoa2 (val nome: String)
class Pessoa3 (nomeInicial: String){
    val nome : String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1("João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    // p2.nome = "Maria" // Erro de compilação
    println("O nome da pessoa é ${p2.nome}")

    val p3 = Pessoa3("João")
    // p3.nome = "Maria" // Erro de compilação
    println("O nome da pessoa é ${p3.nome}")
    println("${p2.nome} e ${p3.nome} são legais!")
}
