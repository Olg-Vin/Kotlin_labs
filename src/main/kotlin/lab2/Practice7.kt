package lab2

fun main(){
    var a:Int = 12
    var b:Int = 6

    println(if (a>b) a%b==0&&a%2==0 else b%a==0&&a%2==0)
}