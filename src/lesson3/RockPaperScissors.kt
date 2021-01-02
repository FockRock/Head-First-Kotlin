package lesson3

import kotlin.random.Random

fun main() {
    val options = arrayOf("Paper", "Scissors", "Rock")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
        optionsParam[Random.nextInt(optionsParam.size)]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following: ")
        for (item in optionsParam) print(" $item")
        println(".")

        var userInput = readLine().toString()
        userInput = userInput.capitalize()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        } else println("You must enter a valid choice.")
    }

    return userChoice
}

fun printResult (userChoice: String, gameChoice: String) {
    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Scissors" && gameChoice == "Paper") ||
            (userChoice == "Paper" && gameChoice == "Rock"))
                result = "You win!"
    else result = "You lose!"
    println("You choose $userChoice. I choose $gameChoice. $result")
}