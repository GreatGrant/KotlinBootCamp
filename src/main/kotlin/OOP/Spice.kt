package OOP

class Spice(
    var name: String,
    var spiciness: String = "mild"
) {

    private val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "Medium" -> 10
            "Spicy" -> 15
            "Very spicy" -> 20
            else -> 0
        }

    init {
        println("$name is $spiciness with output: $heat")
    }
}

fun main() {
    var tumeric = Spice(name = "Tumeric", spiciness = "mild")
    var pepper = Spice("Pepper", spiciness = "very spicy")
    var cumin = Spice(name = "Clove", spiciness = "mild")
    var ginger = Spice(name = "ginger", spiciness = "very spicy")
    var coriander = Spice(name = "Coriander", spiciness = "mild")
    var habanero = Spice(name = "habanero", spiciness = "very spicy")
    var cayennePepper = Spice("Cayenne Pepper", "very spicy")
    var blackPepper = Spice("Black Pepper", "spicy")
    var whitePepper = Spice("White Pepper", "medium")
    var bellPepper = Spice("Bell Pepper", "mild")
    var salt = Spice("Salt", "none")

    var spices = listOf(
        tumeric,
        ginger,
        cayennePepper,
        pepper,
        salt,
        blackPepper,
        cumin,
        ginger,
        whitePepper,
        coriander,
        habanero,
        bellPepper
    )
    var hotSpices = spices.filter { it.spiciness == "very spicy" }

    hotSpices.forEach { spice -> println("Hot spices are ${spice.name}") }
}