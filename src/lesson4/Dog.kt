package lesson4

class Dog (
        val name: String,
        private val weight: Int,
        breed_param: String
) {
    init {
        println("The dog $name has been created")
    }

    var activities = arrayOf("Walks")

    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    fun bark() {
        println(if (weight < 10) "Yf!" else "Woof!")
    }
}