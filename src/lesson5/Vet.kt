package lesson5

class Vet {
    fun giveShot(animal: Animal) {
        println("Animal on the vet table.")
        animal.makeNoise()
    }
}