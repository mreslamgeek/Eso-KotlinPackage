fun main() {


    var arrayInt = Array<Int>(5){0}
    arrayInt[2] = 50
    for (index in arrayInt){
        println(index)
    }
}