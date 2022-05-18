package learn2

class Person(private var name: String, private var age: Int) {

    private val str:String = "Person的属性"

    inner class PersonFeather(var height: Int, var weight: Int) {
        private val str :String = "PersonFeather的属性"
        fun featherMethod() {
            val str :String = "局部属性"
            println("PersonFeather 中的方法")
            this@Person.method()
            println(this@Person.str)
            println(this.str)
            println(str)
        }
    }

    fun method() {
        println("Person 中的方法")
    }

    fun getPerson() {
        val personFeather = PersonFeather(120, 150)
        personFeather.featherMethod();
    }
}

fun main() {
    val person = Person("zhangsan", 18);
    person.getPerson()
}