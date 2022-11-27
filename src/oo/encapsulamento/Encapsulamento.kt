package oo.encapsulamento

private val dentroDoArquivo = 1;
//protected val protefidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1


open class Capsula {
    private val dentroDoArquivo = 1;
    protected val protegido = 1
    internal val dentroDoProjeto = 1
    val publico = 1
}

class SubCapsula : Capsula() {
    fun verificarAcesso() {
        //val visivel = dentroDoArquivo
        val visivel2 = protegido
        val visivel3 = dentroDoProjeto
        val visivel4 = publico
    }
}