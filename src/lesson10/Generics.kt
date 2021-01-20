package lesson10

abstract class Pet(
        var name: String
)

class Cat(name: String): Pet(name)

class Dog(name: String): Pet(name)

class Fish(name: String): Pet(name)

class Contest<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int) {
        if (score >= 0) scores[t] = score
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

fun main() {
    val catTwix = Cat ("Twix")
    val catMax = Cat ("Max")
    val catSox = Cat ("Sox")

    val catContest = Contest<Cat>()
    catContest.addScore(catTwix, 100)
    catContest.addScore(catSox, 30)
    catContest.addScore(catMax, 50)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = DogRetailer()
    petRetailer.sell()
}