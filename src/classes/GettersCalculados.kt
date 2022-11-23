package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {

    val inativo: Boolean
        get() = !ativo

    val precoComDesconto: Double get() = preco * (1 - desconto)

}

fun main(args: Array<String>) {
    val p1 = Produto("iPad", 2349.90, 0.20, true)
    println(p1.precoComDesconto)
    println(p1.inativo)

    val p2 = Produto("Galaxy Tab", 1999.90, 0.50, false)
    if (p2.inativo) {
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }
}