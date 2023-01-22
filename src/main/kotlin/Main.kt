import OOP.Aquarium
import OOP.SimpleSpice

fun main(args: Array<String>) {
    var myAquarium = Aquarium()

    var curry = SimpleSpice()
    curry.name = "Curry"
    curry.spiciness = "hot"
    println("The spice name is ${curry.name}, and the spiciness is ${curry.heat}")
    println("Length of aquarium is ${myAquarium.length},\n height is ${myAquarium.height}" +
            " and width is ${myAquarium.width}")
}