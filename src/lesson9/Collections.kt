package lesson9

data class Recipe(var name: String)

fun main() {
    var mShoppingList = mutableListOf("Tea", "Meat", "Cheese")
    println("Original Shopping List: $mShoppingList")

    val extraShopping = listOf("Eggs", "Cookies", "Juice", "Cheese")
    mShoppingList.addAll(extraShopping)
    println("Upgraded Shopping List: $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList[mShoppingList.indexOf("Tea")] = "Coffee"
    }

    mShoppingList.sort()
    println("Sorted Shopping List: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    val moreShopping = setOf("Ham", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    mShoppingList = mShoppingSet.toMutableList()
    println("New Shopping List: $mShoppingList")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Cesar Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Sausage")
    val r5 = Recipe("Pasta")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("Recipe Map original: $mRecipeMap")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("Recipe Map updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
}