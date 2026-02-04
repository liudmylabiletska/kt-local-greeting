package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val name = readLine().orEmpty()

        if (name.isEmpty()) {
            break
        }

        greet(name)
    }
}

fun greet(name: String) {
    println("Hello, $name!")
}
