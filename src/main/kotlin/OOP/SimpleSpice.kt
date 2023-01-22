package OOP

class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"
    val heat: Int
        get() = if (spiciness == "mild") 5 else 10


}