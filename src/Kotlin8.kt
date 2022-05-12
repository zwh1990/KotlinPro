class ThePerson(name:String, address:String){
    var name = name
        get(){
            println("get invoke")
            return field
        }
        set(value){
            println("set invoke")
            field = value
        }
    var address = address
}

fun main() {
    var person = ThePerson("zhangsan","beijing")
    println(person.name)
    person.name= "lisi"
    println(person.name)
}