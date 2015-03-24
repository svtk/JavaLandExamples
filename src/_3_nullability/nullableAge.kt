package _3_nullability

import _3_nullability.java.User as JUser

fun main(args: Array<String>) {
    val user = JUser("John", "Doe")
    if (user.getAge() < 42) {
        // ...
    }

    val u = User("John", "Doe")
    val age: Int? = u.age
    if (age != null && age < 42) {
        // ...
    }
}