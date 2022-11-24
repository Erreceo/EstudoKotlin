package lambdas

class Calculadora2 {
    var resultado = 0

    fun soma(valor: Int, valor2: Int){
        resultado = valor + valor2
    }
    fun add(valor: Int){
        resultado += valor
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora2()
    calculadora.apply {soma(4, 5)}
    .apply { add(10) }
        .apply { println(resultado) }

    calculadora.apply {
        soma(4, 5)
        add(10)
        println(resultado)
    }

    with(calculadora) {
        soma(4, 5)
        add(10)
        println(resultado)
    }
}