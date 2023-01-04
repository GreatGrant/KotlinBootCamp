package introduction

import java.util.Random

fun main(){
    val day = getFeedingDate()
    val food = arrayOf("Pellets", "Worms", "Algae")
    println("Feed the fish ${food[Random().nextInt(3)]} on $day")
}

fun getFeedingDate(): String{
    val week = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return week[Random().nextInt(5)]
}