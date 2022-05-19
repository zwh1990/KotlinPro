package learn3

import kotlin.reflect.KProperty

/**
 * 属性委托(delegated property)
 */

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "$thisRef,your delegated property name is ${property.name}"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) =
        println("$thisRef,new value is $value")
}

class MyPropertyClass {
    var str: String by MyDelegate()
}

fun main() {
    var myPropertyClass = MyPropertyClass();
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}