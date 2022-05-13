package learn1

/**
 * 属性扩展
 */
class ExtensionProperty

val ExtensionProperty.name: String
    get() = "hello"

fun main() {
    var extensionProperty = ExtensionProperty()
    println(extensionProperty.name)
}