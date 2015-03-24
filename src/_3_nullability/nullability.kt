package _3_nullability

fun test() {
    val name: String? = null

//    val definitelyNotNull: String = name
    val upperCase: String? = name?.toUpperCase()

    val defaultForNull = name ?: "No Name"

    if (name == null) fail("No name provided")
    name.toUpperCase()
}