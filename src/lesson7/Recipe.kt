package lesson7

data class Recipe (val title: String,
                   val mainIngredient: String,
                   val isVegetarian: Boolean = false,
                   val difficulty: String = "Easy")

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this (0, isMagic_param)
}

fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
    return arrayOf()
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers(a: Double, b: Double): Double {                  //Перегрузка функции
    return a + b
}

fun main() {
    val r1 = Recipe ("Thai Curry", "Chicken")
    val r2 = Recipe ("Thai Curry", "Duck")
    val r3 = r1.copy(title = "Chicken Bhuna")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println(r1.toString())
    println(r2.toString())
    println(r3.toString())

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")

    val m1 = Mushroom(6, false)                         //Первичный конструктор
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)                             //Вторичный конструктор
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(4,8))                                  //Целые числа
    println(addNumbers(4.2,6.3))                              //Дробные числа
}