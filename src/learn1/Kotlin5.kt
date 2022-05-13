open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun date(){
        println("3 day")
    }
}

class Apple : Fruit() {
    override fun name() {
        println("apple")
    }
}


fun main() {
    var apple = Apple();
    apple.name()
    apple.date()
}