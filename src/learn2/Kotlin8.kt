package learn2

/**
 * 对象表达式
 * 匿名对象只有在局部变量范围内或者被private修饰的成员变量范围内
 * 才能被识别出真正的类型
 */

fun main() {
    var myclass8 = MyClass8();
    myclass8.test();

    println("-----------------")
    var myclass9 = MyClass9();
    myclass9.test();
}

class MyClass8 {
    private var myObject = object {
        fun output(i: Int) {
            println("i--->$i")
        }
    }

    fun test() {
        myObject.output(5);
    }
}

class MyClass9{
    private fun method1() = object {
        val str = "hello"
    }

    private fun method2() = object {
        val str = "world"
    }

    fun test(){
        println(method1().str)
        println(method2().str)
    }
}