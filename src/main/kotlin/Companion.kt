class Person {
    companion object Test {
        fun callMe() = println("I am called")
    }
}

fun main(){
    Person.callMe()
}
