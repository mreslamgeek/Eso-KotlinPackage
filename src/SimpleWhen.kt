fun main() {

    var x :Int
    print("Please Enter a value: ")
    x= readLine()!!.toInt()
    when (x) {

        1, 2 -> println(" Value Is One or Two!! ")
        in 2..9 -> println(" Value Is in range From Two to Nine!! ")
        10 -> println(" Value Is Ten!! ")
        else -> {

            println("  Value Is Out Of the range!! ")

        }

    }

}