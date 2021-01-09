fun main() {
    var map = HashMap<Int , String>()
    map.put(1 , "Eslam")
    map.put(2, "Title")
    map.put(3, "Description")
    map.put(4, "ImgLink")
    map.put(5 , "Tags")

    println(map[1])
    println(map.get(2))

    for (key in map.keys){
        println(map[key])
    }
}