package _2_extensions

import _1_beans.User

fun main(args: Array<String>) {
    val users = listOf(
            User("John", "Doe", 19),
            User("Jane", "Doe", 22)
    )

    val minors = users.filter({ u: User -> u.age < 21 })

    val firstNames = users.map { it.firstName }.toSet()



    fun foo(i: Int, f: (Int) -> Int) = f(i)

    foo(42, { i -> i * i })
}