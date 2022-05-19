package learn3

/**
 * 延时属性：指的是属性只在第一次被访问的时候才会计算，之后会将之前的计算结果缓存起来供后续调用
 */
val myLazyValue: Int by lazy(LazyThreadSafetyMode.NONE) {
    println("hello world")
    30
}

fun main() {
    println(myLazyValue)
    println(myLazyValue)
}