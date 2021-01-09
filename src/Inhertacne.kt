//Must Be open keyword to make class available for inheritance
open class Opertaions {

    fun sum(n1: Double, n2: Double): Double? {
        var sumResult = n1 + n2
        return sumResult
    }

   open fun sub(n1: Double, n2: Double): Double? {
        var sumResult = n1 - n2
        return sumResult
    }
}

//must call constructor for 2 classes
class MulOperation() : Opertaions() {
    fun div(n1: Double, n2: Double): Double? {
        var sumResult = n1 * n2
        return sumResult
    }

    fun mul(n1: Double, n2: Double): Double? {
        var sumResult = n1 / n2
        return sumResult
    }

    override fun sub(n1: Double, n2: Double): Double? {
        var sumResult = n1 - n2+1
        return sumResult
    }

}

fun main() {
    var op = Opertaions()
    println(op.sum(4.7, 5.3))
    println(op.sub(4.7, 5.3))

    var mulop = MulOperation()
    println(mulop.sum(4.7, 5.3))
    println(mulop.sub(4.7, 5.3))
    println(mulop.div(4.7, 5.3))
    println(mulop.mul(4.7, 5.3))
}