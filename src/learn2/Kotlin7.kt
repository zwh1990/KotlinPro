package learn2

/**
 * 对象表达式  (object expersion)
 */

interface MyInterface {
    fun print(i: Int)
}

abstract class MyAbstractClass {

    abstract val age: Int

    abstract fun info()
}

fun main() {

    var myObject = object : MyInterface {
        override fun print(i: Int) {
            println("i--->$i")
        }
    }

    myObject.print(5)
    println("-------------")

    var myObject2 = object {
        init {
            println("初始化代码块")
        }

        var myProperty = "hello world"
        fun method() = "method"
    }

    println(myObject2.myProperty)
    println(myObject2.method())


    var myObject3 = object : MyInterface, MyAbstractClass() {
        override fun print(i: Int) {
            println("i--->$i")
        }

        override val age: Int
            get() = 20

        override fun info() {
            println("MyAbstractClass info() invoked")
        }

    }

    myObject3.print(10)
    myObject3.info()
    println(myObject3.age)
}