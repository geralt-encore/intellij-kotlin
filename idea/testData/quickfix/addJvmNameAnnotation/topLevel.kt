// "Add '@JvmName' annotation" "true"
// WITH_RUNTIME

fun <caret>bar(foo: List<String>): String {
    return "1"
}

fun bar(foo: List<Int>): String {
    return "2"
}

fun bar1(foo: List<Int>): String {
    return "3"
}

fun bar2(foo: List<Int>): String {
    return "4"
}
