package introduction

import kotlin.random.Random

fun main(){
 repeat(6){
     println("Dice rolled, result ${rollDice(6)}")
 }
    gamePlay(rollDice(6))
}

//Lambda function
val rollDice: (Int) -> Int = {sides ->
    if(sides !=0) Random.nextInt(sides) +1
    else 0
}

fun gamePlay(operator: Int){
    print("called from gameplay: $operator")
}