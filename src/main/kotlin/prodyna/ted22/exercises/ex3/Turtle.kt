package prodyna.ted22.exercises.ex3

data class Turtle(val color: String, var name: String, var age: Int, var description: String?, val friend: Animal?) : Animal {

    init {
        println("Welcome turtle $name!")
    }

    constructor(name: String, friend: Animal?) : this("Brown", name, 10, "DefaultDescription", friend)
}
