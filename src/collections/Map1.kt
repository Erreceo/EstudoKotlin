package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(11111111111, "João")
    map.put(22222222222, "Maria")
    map.put(33333333333, "Pedro")

    map.put(22222222222, "Pedro Filho")

    for(par in map) {
        println(par)
    }

    for(nome in map.values) {
        println(nome)
    }
    for(cpf in map.keys) {
        println(cpf)
    }
    for((cpf, nome)in map) {
        println("$cpf - $nome")
    }

    map.size.print()
    map.get(11111111111)?.print()
    map.contains(11111111111).print()
}