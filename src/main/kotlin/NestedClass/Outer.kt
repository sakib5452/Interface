package NestedClass

class Outer {
    val a = "Outer Nested Class"
//    class Nested{
//        val b = "Inside Nested Class"
//
//        fun callMe() = "Function call from inside nested"
//    }


    inner class Nested{
        val b = a

        fun callMe() = "Function call from inside nested"
    }

}