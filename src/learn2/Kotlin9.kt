package learn2

/**
 * kotlin 对象表达式的代码是可以直接访问外层的变量，与java不同的是，外部变量无需声明成final
 */
fun main() {
    var i = 100
    var myObject = object {
        fun test(){
            i++
        }
    }

    myObject.test()
    println("i--->$i")
}