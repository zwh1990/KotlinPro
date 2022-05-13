/**
 * 数据类  Bean类
 */

data class Person2(val name: String, var age: Int, var address: String)
data class Person3(val name: String = "", var age: Int = 0, var address: String = "")

fun main() {
    var person = Person2("zhangsan", 20, "北京");
    println(person)
    println(person.name)
    var person2 = person.copy(address = "hangzhou")
    println(person2)

    var person3 = Person3();
    var person4 = Person3("lisi",40,"天津");
    println(person3)
    println(person4)
}