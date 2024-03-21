package lab1

import java.time.LocalDate

fun main(){
//    var days:Int = readln().toInt()
    var days:Int = 2642
    var years:Int = days/365
    days %= 365
    var weeks:Int = days/7
    days %= 7
    println("Лет:${years} Недель:${weeks} Дней:${days}")
}