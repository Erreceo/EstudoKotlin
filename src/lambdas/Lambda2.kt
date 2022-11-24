package lambdas

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int ): Int {
        return a + b
    }
    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    println(calculadora.calcular(4, 5))
    println(calculadora.calcular(4, 5, Multiplicacao()))

    val subtracao = {a: Int, b: Int -> a - b}
    println(calculadora.calcular(4, 5, subtracao))
}