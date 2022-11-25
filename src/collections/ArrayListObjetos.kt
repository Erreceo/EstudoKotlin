package collections

data class Fruta(val nome: String, val preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("Maçã", 2.5), Fruta("Banana", 3.0), Fruta("Laranja", 2.0))

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
}