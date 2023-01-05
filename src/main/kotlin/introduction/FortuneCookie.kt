package introduction

fun main(){
    var fortune : String
    for ( i in 1..10){
        fortune = getFortuneCookie(getBirthday())
        print( "Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

}
fun getBirthday(): Int {
    print("\nEnter your birthday\n")
     return readln().toIntOrNull() ?: 1
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
