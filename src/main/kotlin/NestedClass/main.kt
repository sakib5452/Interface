package NestedClass

fun main() {

    val outer = Outer()
    println(outer.a)

    val nested = Outer.Nested()
    println(nested.b)
    println(nested.callMe())
}