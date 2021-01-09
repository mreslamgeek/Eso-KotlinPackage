fun main() {
    println("Please Enter Your Age")

    var myYear = readLine()!!.toInt()
    showAge(myYear)

    var sumResult = sum(5.2, 6.1)
    println(sumResult)
}

fun showAge(number: Int) {
    println("Your Age Is ${2021 - number}")
}

fun sum(n1: Double, n2: Double): Double {
    val sumVal = n1 + n2
    return sumVal
}