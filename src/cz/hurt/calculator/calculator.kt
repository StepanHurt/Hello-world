package OO

import kotlin.random.Random

fun main() {
    val x: Long = Random.nextLong()
    val y: Long = Random.nextLong()
    println(x)
    println(y)

    println(add(x,y))
    println(sub(x,y))
    println(mult(x,y))
    println(div(x,y))
}

fun add(x: Long, y: Long): Long {
    return x + y
}

fun sub(x: Long, y: Long): Long {
    return x - y
}

fun mult(x: Long, y: Long): Long {
    return x * y
}

fun div(x: Long, y: Long): Long {
    return x / y
}
