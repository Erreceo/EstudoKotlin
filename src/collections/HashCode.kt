package collections

class Objeto(val nome: String, val descricao: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?) =
         if(other is Objeto){
             nome.equals(other.nome, ignoreCase = true)
        }else {
             false
        }

}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "Cadeira de escritório"),
        Objeto("Mesa", "Mesa de escritório"),
        Objeto("Faca", "Copo de vidro"),
        Objeto("Copo", "Copo de vidro")
    )
    conjunto.contains(Objeto("Copo", "Copo de vidro")).print()
}