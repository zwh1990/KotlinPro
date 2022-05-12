fun main() {
    var person1 = Person("zhangsan")
    var person2 = Person("lisi", 30)
    var person3 = Person("wangwu", 40, "hangzhou")

    person1.info()
    person2.info()
    person3.info()
}

class Person constructor(userName: String) {
    private var userName: String;
    private var age: Int
    private var address: String

    init {
        println("userName-->$userName")
        this.userName = userName
        this.age = 20
        this.address = "beijing"
    }

    constructor(userName: String, age: Int) : this(userName) {
        this.age = age;
    }

    constructor(userName: String, age: Int, address: String) : this(userName, age) {
        this.address = address
    }

    fun info() {
        println("userName:$userName,age:$age,address:$address")
    }
}