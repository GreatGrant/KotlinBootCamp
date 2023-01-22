package OOP

class Spice(var name: String,
    var spiciness: String = "mild") {

    private val heat: Int
    get() = if (spiciness == "mild") 5 else 10

    init {
        println("$name is $spiciness with output: $heat")
    }
}