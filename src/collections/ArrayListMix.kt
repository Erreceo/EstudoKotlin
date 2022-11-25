package collections

import java.util.*

fun main(args: Array<String>) {
    val listaMix = arrayListOf(1, "Kotlin", 3.14, 'a', true)

    for (item in listaMix) {
        if(item is String) {
            println(item.uppercase(Locale.getDefault()))
        }else{
            println(item)
        }

    }
}