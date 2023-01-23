package oop

data class SpiceContainer(val spice: Spices) {
    val label: String = spice.name
}

fun main(){
    var curry = Curry()
    var curryContainer = SpiceContainer(curry)
    println(curryContainer.label)
}