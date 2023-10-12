package com.gl4.tp

import kotlin.math.abs

fun main (argv : Array<String>){
    print("Hello  ")
  /* var message: String? = "My message can possibly be null !"
    message.uppercase()
    print(message)*/
    //Activité 1
    var hello = "Hello"
    hello = "Hello world!"
    println(hello)
    var toto = "Toto"
    println(toto)
    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message.toString())
    //test activité 2
    sayHello()
    sayMyName("nour")
    var A=sum(4,3)
    print(A)
    //test Activité 3
    val languages =  listOf("JAVA","Kotlin","Python","PHP","JS","HTML","CSS","NET","NEST")
        println("Languages :")
        showList(languages)
        println("Odd Numbers to 10 :")
        oddNumbersTo10()
   //test Activité 4
    val num1 = 10
    val num2 = 5
    print(calculate(num1, num2, '+'))

    // test de travail à rendre

    val rectangles = arrayOf(Rectangle(), Rectangle(p=Point(1 ,2)),Rectangle(q=Point(1 ,2)))
    for ((index, rect) in rectangles.withIndex()) {
        println("Rectangle ${index + 1}: $rect")
        println("Surface of Rectangle  ${index + 1}: ${rect.surface()}")

    }
}





//Activité 2
fun sum (a : Int , b: Int)=a+b
fun sayMyName(name :String) { println(" $name ") }
fun sayHello() = "Hello"

//Activité 3
fun showList(list: List<String>){
    for (element in list) {
        println(element)
    }
}
fun oddNumbersTo10(){
    // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
    for (i in 1 until 11 step 2) {
        println(i)
    }
}

//Activité 4
fun calculate(a: Int, b: Int, operator: Char): Int {
    return when (operator) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> {
            if (b != 0) {
                a / b
            } else {
                throw IllegalArgumentException("Division by zero is not allowed.")
            }
        }
        '%' -> {
            if (b != 0) {
                a % b
            } else {
                throw IllegalArgumentException("Modulo by zero is not allowed.")
            }
        }
        else -> throw IllegalArgumentException("Invalid operator: $operator")
    }
}

// travail à rendre
data class Point (val x:Int, val y:Int){}
fun distance(p:Point, q:Point)= abs(p.x -q.x) + abs(p.y -q.y)
class Rectangle (val p: Point=Point(0,0),val q:Point=Point(1,1)){

    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface(): Int {
        val length = Math.abs(q.x - p.x)
        val width = Math.abs(q.y - p.y)
        return length * width
    }

}
