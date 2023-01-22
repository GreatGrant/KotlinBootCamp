import OOP.Aquarium

fun main(args: Array<String>) {
    var myAquarium = Aquarium()
    myAquarium.volume = -3
    println("Volume is ${myAquarium.volume} Length of aquarium is ${myAquarium.length},\n height is ${myAquarium.height}" +
            " and width is ${myAquarium.width}")
}