package learn3

import kotlin.properties.Delegates


/**
 * 非空属性委托
 * notnull 适用于那些无法在初始化阶段就确定属性值的场合
 */
class Person {
    var address: String by Delegates.notNull()
}

/**
 * 可观测属性委托  Delegates.observable先赋值在走回调
 */
class Person2 {
    var age: Int by Delegates.observable(20) { property, oldValue, newValue ->
        println("${property.name},oldValue:$oldValue,newValue:$newValue")
    }
}

/**
 * 可观测属性委托  Delegates.vetoable 判断为true就赋值，false不赋值
 */
class Person3 {
    var age: Int by Delegates.vetoable(20) { _, oldValue, newValue ->
        when {
            newValue >= oldValue -> true
            else -> false
        }
    }
}

fun main() {
    var person = Person()
    person.address = "beijing"
    println(person.address)

    var person2 = Person2();
    person2.age = 30
    person2.age = 40

    println("=================")
    var person3 = Person3();
    println("age--->${person3.age}")
    person3.age = 40
    println("age--->${person3.age}")
    person3.age = 30
    println("age--->${person3.age}")

}
