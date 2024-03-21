package lab3

fun main(){
    var num = 5
    var result = 0
    while (num <= 57){
        result += if (num !=37 && num != 46 && num != 52) num else 0
        num++
    }
    println(result)
}