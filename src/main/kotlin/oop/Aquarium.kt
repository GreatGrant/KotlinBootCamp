package oop

class Aquarium(
    var width: Int = 23,
    var height: Int = 20,
    var length: Int = 15
) {
    constructor(weight: Int) : this(){
        var weight = weight
        println("Secondary const. weight is $weight")
    }
    var volume: Int
        get() = width.times(height).times(length) / 1000
          set(value) {

            height = value.times(1000) / width.times(length)
        }
}

fun main(){
    var myAquarium = Aquarium(weight = 23)
    println("Length of aquarium is ${myAquarium.length},\n height is ${myAquarium.height}" +
            " and width is ${myAquarium.width}")

}