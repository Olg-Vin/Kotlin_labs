package lab3

fun main(){
    var num = readln().split("")
    var honest = 0
    var odd = 0
    for (n in num){
        var c = if (n != "") n.toInt() else continue
        if (c % 2 == 0) honest += 1
        else odd +=1
    }
    println("honest = $honest, odd = $odd")
}