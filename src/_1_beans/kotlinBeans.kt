package _1_beans

public data class User(public val firstName: String, public val lastName: String, public val age: Int)

fun main(args: Array<String>) {
    println(User("John", "Doe", 30))
}