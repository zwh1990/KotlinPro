fun main() {
    cal();
    println("----------------");
    cla2();
}

fun cal() {
    for (i: Int in 10..20 step 2) {
        println("$i")
    }
}

fun cla2() {
    val list = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
    for (item in list) {
        println(item)
    }

    when {
        "hello" in list -> {
            println("hello 在集合list里面")
        }
    }

    list.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach{(println(it))}

}