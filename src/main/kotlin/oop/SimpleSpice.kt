package oop

class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"
    val heat: Int
        get() = if (spiciness == "mild") 5 else 10


}

fun main(){
    var curry = SimpleSpice()
    curry.name = "Curry"
    curry.spiciness = "hot"

    println("The spice name is ${curry.name}, and the spiciness is ${curry.heat}")

}