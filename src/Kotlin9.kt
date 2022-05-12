class TheClass {
    lateinit var name: String

    fun init() {
        this.name = "zhangsan"
    }

    fun info() {
        println(this.name)
    }

}

fun main() {
    var theClass = TheClass()
    theClass.init()
    theClass.info()
}