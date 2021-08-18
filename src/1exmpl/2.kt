package `1exmpl`



fun main(args: Array<String>) {
    println("Enter a number, and I'll square it: ")
    val xy = readLine()!!
    var y = xy.toInt()
    var z = y.times(y)
    println("Result: $z")
}

