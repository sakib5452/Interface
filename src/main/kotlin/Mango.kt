import Interface.Fruit

class Mango: Fruit  {
    override var color: String = "Black"
    override var test: String = "Sweet"

    override fun size() {
       println("This is big mango")
    }

    override fun tree() {
        super.tree()
        println("this is green tree")
    }
}