class Outer {

    val name: String? = "eslam"

    inner class Inner {
        fun displayName(): String {
            return name!!
        }
    }
}

fun main() {
    // val inner = Outer.Inner()
    // println(inner.)

    val out = Outer()
    val innn =out.Inner()
    println(innn.displayName())

}