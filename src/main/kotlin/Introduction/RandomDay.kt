package Introduction

import java.util.Random

fun main(){

    val day = getFeedingDate()
    val food = getFishFood(day)
    println("Feed the fish $food on $day")
    if (shouldChangeWater(day)) println("Change water today")
    canAddFish(10.0, listOf(3,3,3)) //---> false
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false) //---> true
    canAddFish(9.0, listOf(1,1,3), 3) //---> false
    canAddFish(10.0, listOf(), 7, true) //---> true
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
fun canAddFish(tankSize: Double,
               currentFish: List<Int>,
               fishSize: Int = 2,
               hasDecorations: Boolean = true): Boolean{

    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)


}
fun getFeedingDate(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return week[Random().nextInt(5)]
}