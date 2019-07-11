package prodyna.ted22.exercises.ex4

data class Human(var name: String) : Greetings {

    override fun greet(otherName: String) = println("Hello $otherName, nice to meet you!")
}