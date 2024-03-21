package lab2

fun main(){
    var a:Int = 2
    var b:Int = 6
    println("У вас есть числа: ${a} и ${b}")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    var action:Int = readln().toInt()
    when (action){
        1 -> println("Результат: ${a+b}")
        2 -> println("Результат: ${a-b}")
        0 -> println("Вы подумали что 'ничего' это странно и выбрали 0 " +
                "однако действительное произошло ничего, попытка не пытка")
    }
}