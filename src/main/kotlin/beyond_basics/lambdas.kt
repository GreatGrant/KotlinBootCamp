package beyond_basics

fun main(){

    var game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)

}
enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    var north = { path.add(Directions.NORTH) }
    var south = { path.add(Directions.SOUTH) }
    var east = { path.add(Directions.EAST) }
    var west = { path.add(Directions.WEST) }

    var end = {
        path.add(Directions.END)
        println("Game over: $path")
        path.clear()
        false
    }
}