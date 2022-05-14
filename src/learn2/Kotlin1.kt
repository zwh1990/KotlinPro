package learn2

/**
 * 泛型的使用
 */

class MyGeneric<T>(t: T) {
    var v: T

    init {
        this.v = t
    }
}

fun main() {
    var myGeneric = MyGeneric("hello world")
    println(myGeneric.v)
    println("-------------------")
    var myTest = MyClass("abc")
    test(myTest);
}

/**
 * 协变与逆变
 */

class MyClass<out T>(t: T) {
    private var t: T

    init {
        this.t = t
    }

    fun get(): T = this.t
}

fun test(myClass: MyClass<String>) {
    var myObject: MyClass<Any> = myClass
    println(myObject.get())
}

