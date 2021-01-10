package lesson5

abstract class Canine: Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Fox: Canine() {
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Frfrfrfr!")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}