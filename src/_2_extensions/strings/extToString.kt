package _2_extensions.strings

fun String.lastChar() = this.charAt(this.length() - 1)

//'this' can be omitted
fun String.lastChar1() = charAt(length() - 1)


fun test(s: String) {
    val c: Char = s.lastChar()
}