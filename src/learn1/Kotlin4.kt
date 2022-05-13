package learn1

fun main() {
    val student = Student("zhangsan", 20, "beijing")
    student.info()
}

class Student(private var userName: String, private var age: Int, private var address: String) {

    fun info() {
        println("userName:$userName,age:$age,address:$address")
    }
}