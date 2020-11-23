package lesson2

fun main() {
    val wordArray1 = arrayOf("24/7", "Multi-tier", "B-to-B", "Dynamic", "Pervasive")
    val wordArray2 = arrayOf("Empowered", "Leveraged", "Aligned", "Targeted")
    val wordArray3 = arrayOf("Process", "Paradigm", "Solution", "Portal", "Vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}