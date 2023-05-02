object MySingleton {
    var counter: Int = 0
        private set

    fun incrementCounter() {
        counter++
    }
}

fun main() {
    MySingleton.incrementCounter()
	println(MySingleton.counter)
    MySingleton.incrementCounter()
    println(MySingleton.counter)
}
