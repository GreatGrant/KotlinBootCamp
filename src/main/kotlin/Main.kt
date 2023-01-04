fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val fishName = "Tilapia"
    var result = ""
    result = when(fishName.length){
        0 -> "An error occured"
        in 3..12 -> "Good fish name"
        else -> "Ok good fish name"
    }
    println("Result is : $result")
    var numbers = arrayOf(11..15)
    var str = mutableListOf<String>()
    numbers.forEach {
        str.add(it.toString())
    }

    for (no in 0..100 step 7){
        print(" numbers from beginning $no")
    }
}
