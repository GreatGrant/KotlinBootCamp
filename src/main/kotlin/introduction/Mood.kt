fun main(){
    print(whatShouldIdoToday("Bored"))
}

fun whatShouldIdoToday(mood: String,
                       weather: String = "sunny",
                       temperature: Int = 24) : String{
    return when{
        mood === "bored" && weather === "Cloudy" && temperature < 24 -> {
            "Go for a walk"
        }

        else -> { "Just stay home, homie"}
    }
}