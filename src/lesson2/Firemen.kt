package lesson2

fun main() {

    val firemen = arrayOf("Pugh", "Max", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0

    while (firemanNo < 6) {
        println("Firemen number $firemanNo is ${firemen[firemanNo]}")
        firemanNo++
    }
}