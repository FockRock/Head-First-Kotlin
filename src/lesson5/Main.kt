package lesson5

import lesson6.Vehicle

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

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (i in roamables) {
        i.roam()
        if (i is Animal)
            i.eat()
    }
}