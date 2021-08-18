package `1exmpl`

import kotlin.math.PI

fun main(args: Array<String>) {
    println("Enter the circle's radius (cm):")
    val r = readLine()!!
    var y = r.toInt()
    var g = PI*y
    var f = 2*PI*y
    println("The circle's circumference based on the given radius is: $g")
    println("Area of the circle is: $f")
}