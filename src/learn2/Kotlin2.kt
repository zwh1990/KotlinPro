package learn2

open class Animal
class Cat : Animal()
class Dog : Animal()

fun main() {
    var list: List<Animal> = listOf(Cat(), Dog(), Animal());
    for (item: Animal in list) {
        println(item)
    }

    var list2: List<Animal> = listOf(Animal(), Animal());
    var list3: List<Cat> = listOf(Cat(), Cat());
    list2 = list3;
    for (item: Animal in list2) {
        println(item)
    }

}

