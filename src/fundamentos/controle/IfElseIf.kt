package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 9.3

    //Usando o operador range

    if(nota in 9.0..100.0){
        println("Fantástico")
    }else if(nota in 7.0..8.0){
        println("Parabéns")
    }else if(nota in 4.0..6.0){
        println("Tem como recuperar")
    }else if(nota in 0.0..3.0){
        println("Te vejoo no próximo semestre")
    }else{
        println("Nota inválida")
    }
}