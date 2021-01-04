package lesson4

class Dog (
        val name: String,
        weight_param: Int,
        breed_param: String
) {
    init {
        println("The dog $name has been created")
    }

    var activities = arrayOf("Walks")

    val breed = breed_param.toUpperCase()

    private var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    init {
        println("The breed is $breed")
    }

    fun bark() {
        println(if (weight < 10) "Yf!" else "Woof!")
    }
}