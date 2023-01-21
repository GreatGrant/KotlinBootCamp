package Introduction

import java.util.Calendar

fun main(args: Array<String>){

    dayOfTheWeek()
}

fun dayOfTheWeek() {

    val dayOfTheWeek = when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        else -> {"Saturday"}
    }
    print(dayOfTheWeek)
}
