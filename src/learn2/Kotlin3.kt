package learn2

/**
 * 泛型函数
 */
fun <T> getItem(item: T): T {
    return item;
}

fun main() {
    val num = getItem(3);
    println("num---> $num")
}