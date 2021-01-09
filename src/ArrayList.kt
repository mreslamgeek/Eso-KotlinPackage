fun main() {
    var arrryList=ArrayList<String>()
    arrryList.add("Eslam")
    arrryList.add("Sa3id")
    arrryList.add("Esam")
    arrryList.add("Ezz")

    println("Please Enter Name that you want to search")
    var search = readLine()!!.toString()
    if (arrryList.contains(search)){
        println("Name is Found")
    }else {
        println("item is not found")
    }
}