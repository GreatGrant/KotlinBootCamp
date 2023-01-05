package introduction

fun main(){
    print( "Your fortune is: ${getFortuneCookie()}")
}

fun getFortuneCookie() : String{

    var fortunes = arrayListOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday\n")
    val birthday = readln()?.toIntOrNull()?: 1
    return fortunes[birthday.rem(fortunes.size)]

}
