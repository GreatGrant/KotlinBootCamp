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

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW

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