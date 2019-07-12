package prodyna.ted22.exercises.ex6

data class Human(var name: String = "Max Mustermann") : Greetings {

    override fun greet(otherName: String) = println("Hello $otherName, nice to meet you!")
}