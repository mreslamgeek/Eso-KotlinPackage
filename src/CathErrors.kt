fun main() {
    val n1 = 10
    val n2 = 0
    val n3 = 12

    val sum = n1 + n2 + n3
    println("sum=$sum")

    val sub = n1 - n2 - n3
    println("sub=$sub")

    try {
        val div = n1 / n2 / n3
        println("div=$div")
    } catch (ex: Exception) {
        println(ex.message)
    }

    val mul = n1 * n2 * n3
    println("mul=$mul")

}