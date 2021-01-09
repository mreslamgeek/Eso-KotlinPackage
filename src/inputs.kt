import java.util.*

fun main(){

    print("Enter Yor Name: ")
    var name = readLine()
    println("Your Name is: $name")

    print("Enter Yor Age: ")
    var age :Int = readLine()!!.toInt()
    println("Your Age is: $age")

    print("Enter Yor DOB ")
    var dob :Int = readLine()!!.toInt()


    var year=Calendar.getInstance().get(Calendar.YEAR)
    age=year-dob
    println("Your Age is $age Years old")

}