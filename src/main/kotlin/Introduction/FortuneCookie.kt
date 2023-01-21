package Introduction

fun main(){
    var fortune : String = ""

    while (!fortune.contains("Take it easy")){
        fortune = getFortuneCookie(getBirthday())
        print( "Your fortune is: $fortune")
    }



}
fun getFortuneCookie(birthday: Int) : String{

    var fortunes = arrayListOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val fortuneSelected = when (birthday) {
        in 1..20 -> 7
        in 21..30 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[fortuneSelected]

}

fun getBirthday(): Int {
    print("\nEnter your birthday\n")
    return readln().toIntOrNull() ?: 1
}
fun whatShouldIdo(mood: String, temperature: Int = 24, weather: String = "sunny"): String{
    return when{
        isHappySunny(mood, temperature, weather) -> "Go for a walk"
        isSadRainyCold(mood, temperature, weather) -> "Stay indoors and take coffee"
        isVeryHot(mood, temperature, weather) -> "Go to the beach"
        else -> {"Just browse social media"}
    }
}

fun isHappySunny(mood: String, temperature: Int, weather: String) =
    mood == "Go for a walk" && temperature == 28 && weather == "sunny"

fun isSadRainyCold(mood: String, temperature: Int, weather: String) =
    mood == "Sad" && temperature <= 10 && weather == "cold"

fun isVeryHot(mood: String, temperature: Int, weather: String) = temperature >= 28
