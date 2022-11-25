package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)
    conjunto.add(3).print()
    conjunto.add(10).print()
    conjunto.remove("a").print()
    conjunto.contains('a').print()
    conjunto.contains(10).print()
    conjunto.size.print()
    conjunto.isEmpty().print()
    conjunto.clear()
    conjunto.isEmpty().print()
}