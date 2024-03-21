package lab2

fun main(){
    var a:Int = 7
    var b:Int = 0
    var c:Int = 7

    if (a==b || a==c || b==c){
        println("error")
        return
    }
     if (a>b && a>c){
        if (b>c) println(b)
        else println(c)
    }
    else if (b>a && b>c) {
        if (a>c) println(a)
        else println(c)
    }
    else {
        if (b>a) println(b)
        else println(a)
    }
}