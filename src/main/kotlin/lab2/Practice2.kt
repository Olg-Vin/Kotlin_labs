package lab2

fun main(){
    var old:Int = readln().toInt()
    when (old){
        in 0..17 -> println("Вы ещё слишком молоды")
        18 -> println("Ура, Вам 18 лет!")
        in 19..Int.MAX_VALUE -> println("Вам уже всё можно")
    }
}