package prodyna.ted22.exercises.ex2

class MyTurtleGame {

    var config : String = "Test Mode"
        private set

    fun createTurtles() {
        println("The current config is $config")

        var turtleSam = Turtle("green", "Sam", 34, "My first turtle")
        var turtleRoger = Turtle("brown", "Roger", 21, "My second turtle")
        var turtleJohn = Turtle("John")
    }
}