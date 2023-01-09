fun main(){
    println("What's your mood?")
    val mood = readln()
    println("How's the weather like today?")
    val weather = readln()
    print(whatShouldIdoToday(mood = mood, weather = weather))
}

fun whatShouldIdoToday(mood: String,
                       weather: String = "sunny",
                       temperature: Int = 24) : String{
    return when{
        mood === "bored" && weather === "cloudy" && temperature == 24 -> {
            "Go for a walk"
        }

        else -> { "Just stay home, homie"}
    }
}