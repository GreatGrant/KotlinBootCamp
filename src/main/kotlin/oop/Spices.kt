package oop

abstract class Spices(
    var name: String,
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

    abstract val color: SpiceColor
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "Yellow"

}

class Curry(name: String = "Curry", spiciness: String = "mild") :
    Spices(name, spiciness), Grinder{

    override fun prepareSpice() {
        println("Preparing $name")
    }

    override val color = YellowSpiceColor

    override fun grind() {
        println("Grinding $name")
    }


}

fun main() {
    val curry = Curry()
    println("${curry.name} is color ${curry.color.color}")
}