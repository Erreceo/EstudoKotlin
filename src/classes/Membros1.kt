package classes

class Data(var dia: Int, var mes: Int, var ano: Int)     {
    fun formatar() : String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    val nascimento = Data(1, 1, 1970)
    println(nascimento.formatar())
    with(nascimento) {
        dia = 15
        mes = 8
        ano = 1990
    }
    println(nascimento.formatar())
}