package OO

import kotlin.random.Random

fun main(args: Array<String>) {
    var x: Long = args.get(0).toLong();
    var y: Long = args.get(1).toLong();

    println(x)
    println(y)

    println(add(x, y))
    println(sub(x, y))
    println(mult(x, y))
    println(div(x, y))
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
