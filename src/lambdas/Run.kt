package lambdas

data class Casa(var endereco: String = "", var numero: Int= 0)


fun main(args: Array<String>) {
    var casa = Casa()
    casa.run{
        endereco = "Rua das Flores"
        numero = 123
    }
    println(casa)
}