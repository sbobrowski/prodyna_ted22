package prodyna.ted22.exercises.ex4

class MyTurtleGame() {

    var config : String = "Test Mode"
        private set

    fun createTurtles() {
        println("The current config is $config")

        var turtleSam = Turtle(GREEN, "Sam", 34, "My first turtle", null, Human("James Kirk"))
        var turtleRoger = Turtle(MULTI_COLOR(3), "Roger", 21, "My second turtle", null, Human("Luke Skywalker"))
        var turtleJohn = Turtle("John", Cat(false, "Susi"), Human("Jack Sparrow"))

        printFriend(turtleJohn)

        println("The turtle ${turtleSam.name} has a calculated weight of ${turtleSam.calculateWeight(true)}")

        // Roger wants to greet
        turtleRoger.greet("William")
    }

    private fun printFriend(turtle: Turtle) {
        if(turtle.friend != null) {
            if(turtle.friend is Cat)
                println("My friend is a cat with shortHair: ${turtle.friend.shortHair}")
            else if(turtle.friend is Turtle)
                println("My friend is a turtle with color: ${turtle.friend.color}")
        }
    }

}