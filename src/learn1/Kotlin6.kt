interface A {
    fun method() {
        println("A")
    }
}

open class B() {
    open fun method() {
        println("B")
    }
}

class C : A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }
}

fun main() {
    var c = C();
    c.method()
}