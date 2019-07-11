package prodyna.ted22.exercises.ex2

data class Turtle(var color: String, var name: String, var age: Int, var description: String) {

    init {
        println("Welcome turtle $name!")
    }

    constructor(name: String) : this("Brown", name, 10, "DefaultDescription")
}
