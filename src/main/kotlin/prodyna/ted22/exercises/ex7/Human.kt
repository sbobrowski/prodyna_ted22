package prodyna.ted22.exercises.ex7

data class Human(var name: String = "Max Mustermann", var age: Int = 18, var address: String = "Musterstraße") : Greetings {

    override fun greet(otherName: String) = println("Hello $otherName, nice to meet you!")
}