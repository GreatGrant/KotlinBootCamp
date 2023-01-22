package OOP

class Aquarium {
    var width = 23
    var height = 20
    var length = 15

    var volume: Int
        get() = width.times(height).times(length) / 1000
        set(value) {height = value.times(1000) / width.times(length) }
}