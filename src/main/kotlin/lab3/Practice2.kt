package lab3

fun main(){
    val randomNum = (1..9).random()
    var num = readln().toInt()
    while (randomNum!=num){
        println("It's not a ${num}, try again")
        num = readln().toInt()
    }
    println("u right, it's a $randomNum")
}