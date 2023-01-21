package Introduction
import java.time.LocalTime

fun main(args: Array<String>){
    val time = LocalTime.now().hour
    println(greet(time))
}

/**
 * Create a function that takes an argument representing the time in 24-hour format
 * (values between and including 0 -> 23).
 * check if the time is before midday (<12),
 * then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".
 */

fun greet(hour: Int): String{
    return  if (hour < 12) "Good Morning Kotlin" else "Good night, Kotlin"
}