package OOP

abstract class Spices(
    private var name: String,
    private var spiciness: String = "mild"
) {

    abstract fun prepareSpice()
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

interface Grinder{
    fun grind()
}

interface SpiceColor{
    var color: String
}

object YellowSpiceColor{

}

class Curry(private var name: String = "Curry", spiciness: String="mild"): Spices(name, spiciness), Grinder{
    override fun prepareSpice() {
        println("Preparing $name")
    }

    override fun grind() {
        println("Grinding $name")
    }

}
fun main() {

}