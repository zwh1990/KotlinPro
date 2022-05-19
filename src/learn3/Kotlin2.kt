package learn3

/**
 * 委托类（delegation class）
 */

interface MyInterface {
    fun myPrint();
}

class MyInterfaceImp(private val name: String) : MyInterface {
    override fun myPrint() {
        println("welcome $name")
    }

}

/**
 * 类委托原理：by关键字 后面的委托对象实际上会被储存在类的内部，编译器则会父接口中的多有方法实现出来，
 * 并且将实现转移给委托对象来进行
 */
class MyClass(myInterface: MyInterface):MyInterface by myInterface

fun main() {
    val myInterfaceImp = MyInterfaceImp("张三")
    MyClass(myInterfaceImp).myPrint()
}