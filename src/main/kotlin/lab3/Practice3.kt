package lab3

import kotlin.math.sqrt

fun main(){
    var num = readln().toInt()
    var result = mutableSetOf(1)
    for (i in 1..(sqrt(num.toDouble())+1).toInt()) {
        if (num % i == 0){
            var res = num/i
            result.add(res)
            result.add(i)
        }
    }
    println(result.sorted())
}

// попробовать написать алгоритм рекурсивно.
