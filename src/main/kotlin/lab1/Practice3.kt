package lab1

fun main(){
    var num:Int = readln().toInt()
    while (num/10!=0){
        println(num%10)
        num /= 10
    }
    println(num)
}