/**
 * 扩展函数与类之间的调用
 */
class AA {
    fun method() {
        println("method")
    }
}

class BB {
    fun method2() {

    }

    fun AA.hello() {
        method()
        method2()
    }

    fun world(aa: AA) {
        aa.hello()
    }

    fun AA.output() {
        println(toString())
        println(this@BB.toString())
    }

    fun test() {
        var aa = AA()
        aa.output()
    }

}

fun main() {
    var bb = BB()
    bb.test()
//    var aa = AA()
}