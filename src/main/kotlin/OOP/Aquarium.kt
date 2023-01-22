package OOP

class Aquarium(
    var width: Int = 23,
    var height: Int = 20,
    var length: Int = 15
) {

    var volume: Int
        get() = width.times(height).times(length) / 1000
        set(value) {
            height = value.times(1000) / width.times(length)
        }
}