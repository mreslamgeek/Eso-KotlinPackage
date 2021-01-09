interface op {
    fun sum(n1: Double, n2: Double)
    fun sub(n1: Double, n2: Double)
}

class UserOp : op {
    override fun sum(n1: Double, n2: Double) {
        println(n1 + n2)
    }

    override fun sub(n1: Double, n2: Double) {
        println(n1 - n2)

    }

}

class AdminOp:op{
    override fun sum(n1: Double, n2: Double) {
        println(n1 + n2+10)
    }

    override fun sub(n1: Double, n2: Double) {
        println(n1 - n2+10)
    }
}

fun main() {
    var userop = UserOp()
    var adminop=AdminOp()

    userop.sum(10.0,20.0)
    userop.sub(10.0,20.0)
    adminop.sum(10.0,20.0)
    adminop.sub(10.0,20.0)
}