package lab2

fun main(){
    var loss:Int = 345
    var profit:Int = 750

    if (loss>profit) println("Ваши убытки составили: ${loss-profit}")
    else println("Ваша прибыль составили: ${profit-loss}")
}