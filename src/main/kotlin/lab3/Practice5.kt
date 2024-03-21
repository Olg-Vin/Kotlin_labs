package lab3

fun main(){
    var result = 0;
    for (i in 4..100 step 4) {
        result += i
    }
    println(result)
}