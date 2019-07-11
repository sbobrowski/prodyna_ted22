package prodyna.ted22.exercises.ex3

class MyTurtleGame() {

    var config : String = "Test Mode"
        private set

    fun createTurtles() {
        println("The current config is $config")

        var turtleSam = Turtle("green", "Sam", 34, "My first turtle", null)
        var turtleRoger = Turtle("brown", "Roger", 21, "My second turtle", null)
        var turtleJohn = Turtle("John", Cat(false, "Susi"))

        printFriend(turtleJohn)
    }

    private fun printFriend(turtle: Turtle) {
        if(turtle.friend == null) return

        if(turtle.friend is Cat)
            println("My friend is a cat with shortHair: ${turtle.friend.shortHair}")
        else if(turtle.friend is Turtle)
            println("My friend is a turtle with color: ${turtle.friend.color}")
    }
}