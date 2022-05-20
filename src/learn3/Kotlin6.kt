package learn3

import java.util.*

/**
 * map 委托
 * 将属性保存到map中
 * map 中的key 要与属性保持一致
 */
class Student(map: Map<String, Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(map: MutableMap<String, Any?>) {
    var name: String by map
}

fun main() {
    var student = Student(
        mapOf(
            "name" to "zhangsan",
            "address" to "beijing",
            "age" to 20,
            "birthday" to Date()
        )
    )

    println(student.name)
    println(student.address)
    println(student.age)
    println(student.birthday)

    println("----------------")
    val map: MutableMap<String, Any?> = mutableMapOf(
        "name" to "lisi"
    )
    val student2 = Student2(map)
    println(student2.name)
    println(map["name"])

    student2.name = "wagnwu"
    println(student2.name)
    println(map["name"])

}