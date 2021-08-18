package `1exmpl`

fun main(args: Array<String>) {
    println("Hi, what is your name? ")
    val name = readLine()!!

    println("What are you like? ")
    val like = readLine()!!

    println("$name is $like")
}