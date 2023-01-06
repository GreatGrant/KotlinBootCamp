package introduction

import java.util.Random

fun main(){
    val day = getFeedingDate()
    val food = getFishFood(day)
    println("Feed the fish $food on $day")
    if (shouldChangeWater(day)) println("Change water today")
}

fun getFishFood(day: String): String {
    return when(day){
        "Monday" -> "Plankton"
        "Tuesday" -> "Pellets"
        "Wednesday" -> "Lettuce"
        "Thursday" -> "Flakes"
        else -> "Worms"
    }
}

fun shouldChangeWater(day: String,
                      temperature: Int = 22,
                      dirty: Int = 20 ): Boolean {
    return true
}
fun getFeedingDate(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return week[Random().nextInt(5)]
}