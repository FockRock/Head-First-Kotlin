package lesson2

import kotlin.random.Random

fun main() {

    val wordArray1 = arrayOf("24/7", "Multi-tier", "B-to-B", "Dynamic", "Pervasive")
    val wordArray2 = arrayOf("Empowered", "Leveraged", "Aligned", "Targeted")
    val wordArray3 = arrayOf("Process", "Paradigm", "Solution", "Portal", "Vision")

    val rand1 = Random.nextInt(until = wordArray1.size)
    val rand2 = Random.nextInt(until = wordArray2.size)
    val rand3 = Random.nextInt(until = wordArray3.size)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)
}