import OOP.Aquarium
import OOP.SimpleSpice
import OOP.Spice
import sun.security.provider.ConfigFile.Spi

fun main(args: Array<String>) {


    var curry = SimpleSpice()
    curry.name = "Curry"
    curry.spiciness = "hot"

    println("The spice name is ${curry.name}, and the spiciness is ${curry.heat}")

    var myAquarium = Aquarium(weight = 23)
    println("Length of aquarium is ${myAquarium.length},\n height is ${myAquarium.height}" +
            " and width is ${myAquarium.width}")

    var tumeric = Spice(name = "Tumeric", spiciness = "mild")
    var pepper = Spice("Pepper", spiciness = "hot")
    var cumin = Spice(name = "Clove", spiciness = "mild")
    var ginger = Spice(name ="ginger", spiciness = "hot")
    var coriander = Spice(name="Coriander", spiciness = "mild")
    var habanero = Spice(name = "habanero", spiciness = "hot")

    var spices = listOf(tumeric, pepper, cumin, ginger, coriander, habanero)
    var hotSpices = spices.filter { it.spiciness == "hot"}

    hotSpices.forEach { spice ->  println("Hot spices are ${spice.name}") }


}