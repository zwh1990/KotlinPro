package learn3

import kotlin.properties.Delegates

/**
 * 非空属性委托
 * notnull 适用于那些无法在初始化阶段就确定属性值的场合
 */
fun main() {
    var person = Person()
    person.address = "beijing"
    println(person.address)
}

class Person {
    var address: String by Delegates.notNull<String>()
}