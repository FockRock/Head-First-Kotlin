package lesson3

fun main() {
    val options = arrayOf("Paper", "Scissors", "Rock ")
    val choice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) =
        optionsParam[(optionsParam.size * Math.random()).toInt()]