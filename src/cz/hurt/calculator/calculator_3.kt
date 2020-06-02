package cz.hurt.calculator

import java.util.Scanner

fun main(args:Array<String>){

    val reader = Scanner(System.`in`)
    println("-----Welcome to the Calcuator App-----")
    println("Enter two numbers: ")



    while(true)
    {

        print("First Number: ")
        val x = reader.nextDouble()
        print("Second Number: ")
        val y = reader.nextDouble()

        println("\n1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Quit")

        print("Enter your choice:  ")
        val ch = readLine()

        println()
        when(ch){

            "1" -> println(x+y)
            "2" -> println(x-y)
            "3" -> println(x*y)
            "4" -> println(x/y)
            "5" -> return

        }
    }



}