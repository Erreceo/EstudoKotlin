package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.90)
    val p2 = Produto("Galaxy Tab", 1999.90)

    println(p1 maisCaroQue p2)
    println(p2 maisCaroQue p1)
}