package _5_builders

fun buildString(): String {
    val stringBuilder = StringBuilder()
    with (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}