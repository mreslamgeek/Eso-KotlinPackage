class CarClasses {
    var type: String? = null
    var owner: String? = null
    var model: Int? = null
    var price: Double? = null
    var milesDrive: Int? = null


    constructor(Type: String, Model: Int, Price: Double, MilesDrive: Int, Owner: String) {
        this.owner = Owner
        this.type = type
        this.price = price
        this.milesDrive = milesDrive
        this.model = model
    }

    constructor() {
        this.owner = "ezz"
    }

    fun get_Owner(): String? {
        return this.owner
    }


}

fun main() {
    var car1 = CarClasses("BMW",2008,35000.0,105,"Eslam")
    var car2 = CarClasses()
    var owner1 = car1.get_Owner()
    var owner2 = car2.get_Owner()
    println("$owner1 , $owner2")
}