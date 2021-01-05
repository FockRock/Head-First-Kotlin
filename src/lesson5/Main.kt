package lesson5

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (i in animals) {
        i.roam()
        i.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}