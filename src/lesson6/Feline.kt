package lesson6

import lesson5.Animal

abstract class Feline: Animal () {
    override fun roam() {
        println("The Feline is Roaming")
    }
}

class Lion: Feline() {
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "jungle"

    override fun makeNoise() {
        println("Graaawr!")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }
}

class Cheetah: Feline() {
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "jungle"

    override fun makeNoise() {
        println("Griiiaaawr!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}

class Lynx: Feline() {
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Grrraaa")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}