package fundamentos

fun main(args: Array<String>) {
    //Tipos Numéricos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9223372036854775807L

    //Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo Caractere
    val char: Char = '?'

    //Tipo booleano
    val boolean: Boolean = true


    var string: String = "A"

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)

    println(9223372036854775807 is Long)



}