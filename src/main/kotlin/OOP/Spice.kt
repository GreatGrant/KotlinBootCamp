package OOP

class Spice(var name: String,
    var spiciness: String = "mild") {

    private val heat: Int
    get() = if (spiciness == "mild") 5 else 10

    init {
        println("$name is $spiciness with output: $heat")
    }
}

fun main(){
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