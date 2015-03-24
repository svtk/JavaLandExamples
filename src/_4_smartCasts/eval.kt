package _4_smartCasts

trait Expr
class Num(val value : Int) : Expr
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e : Expr) : Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args : Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}