package NestedClass

fun main() {

    val outer = Outer()
    println(outer.a)

//    val nested = Outer.Nested()
    val nested = outer.Nested() //inner ar jonno
    println(nested.b)
    println(nested.callMe())
}