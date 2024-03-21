package lab2

fun main(){
    var num:Int = readln().toInt()
    when (num) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Такого дня недели нет в этом веке")
    }
}