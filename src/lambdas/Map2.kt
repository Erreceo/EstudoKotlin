package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário Escolar", 21.90),
    Produto("Borracha Branca", 3.89),
    Produto("Apontador Preto", 4.20),
    Produto("Transferidor", 5.50),
    Produto("Compasso", 9.99),
    Produto("Mochila Escolar", 120.32),
    Produto("Caneta Esferográfica", 2.89)
)

fun main(args: Array<String>) {
    val totalizar = {total: Double, atual:Double -> total + atual}

    val precoTotal = materialEscolar.map{it.preco}.reduce(totalizar)

    print(precoTotal)
}