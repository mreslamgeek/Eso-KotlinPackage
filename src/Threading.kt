class Threading : Thread {
    var proccessName: String? = null


    constructor(proccessName: String) : super() {
        this.proccessName = proccessName
    }

    override fun run() {
        var count = 0
        while (count < 10) {
            println("${this.proccessName} count = $count")
            try {

                Thread.sleep(1000)

            } catch (ex: Exception) {
                println(ex.message)
            }
            count++
        }
    }
}

fun main() {
    var t1=Threading("T1")
    t1.start()
    var t2=Threading("T2")
    t2.start()
    var t3=Threading("T3")
    t3.start()
    t3.join()
    //means no compleate code until t3 finish his work
    println("Threads is Running")
}