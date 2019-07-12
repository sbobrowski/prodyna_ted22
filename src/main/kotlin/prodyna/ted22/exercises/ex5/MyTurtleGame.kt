package prodyna.ted22.exercises.ex5

class MyTurtleGame() {

    var config : String = "Test Mode"
        private set

    fun createTurtles() {
        println("The current config is $config")

        var turtleSam = Turtle(GREEN, "Sam", 8, "My first turtle", null, Human("James Kirk"))
        var turtleRoger = Turtle(MULTI_COLOR(3), "Roger", 21, "My second turtle", null, Human("Luke Skywalker"))
        var turtleJohn = Turtle("John", Cat(false, "Susi"), Human("Jack Sparrow"))
        var turtleFred = Turtle(MULTI_COLOR(3), "Fred", 21, null, null, Human("Leia Organa"))
        var turtlePaul = Turtle(BROWN, "Paul", 8, null, null, Human("Jean Luc Picard"))
        var turtleWill = Turtle(MULTI_COLOR(4), "Will", 8, null, null, Human("Harry Potter"))
        var turtleCharly = Turtle(BROWN, "Charly", 34, null, null, Human("Hermine Granger"))
        var turtleHenry = Turtle(BLACK, "Henry", 72, null, null, Human("Henry Maske"))
        var turtleAngus = Turtle(BLACK, "Angus", 72, null, null, Human("MacGyver"))
        var turtleMichael = Turtle(GREEN, "Michael", 88, null, null, Human("Michael Knight"))
        var turtleLewis = Turtle(GREEN, "Lewis", 2, null, null, Human("Lewis Hamilton"))
        var turtlePhil = Turtle(BROWN, "Phil", 41, null, null, Human("Phil Collins"))
        var turtlePeter = Turtle(BLACK, "Peter", 56, null, null, Human("Peter O'Tool"))

        printFriend(turtleJohn)

        println("The turtle ${turtleSam.name} has a calculated weight of ${turtleSam.calculateWeight(true)}")

        // Roger wants to greet
        turtleRoger.greet("William")

        var turtleList = listOf(turtleSam, turtleRoger, turtleJohn, turtleFred, turtlePaul, turtleWill, turtleCharly,
                turtleHenry, turtleAngus, turtleMichael, turtleLewis, turtlePhil, turtlePeter)

        describeTheColors(turtleList.subList(0,2))

        printAllBrownTurtles(turtleList)
        onlyOneCharly(turtleList)
        //onlyOneGreen(turtleList)
        sumAges(turtleList)
    }

    private fun printFriend(turtle: Turtle) {
        if(turtle.friend != null) {
            if(turtle.friend is Cat)
                println("My friend is a cat with shortHair: ${turtle.friend.shortHair}")
            else if(turtle.friend is Turtle)
                println("My friend is a turtle with color: ${turtle.friend.color}")
        }
    }

    private fun describeTheColors(turtles: List<Turtle>) = turtles.forEach { it.describeColor() }

    private fun printAllBrownTurtles(turtles: List<Turtle>) = (turtles.filter { it.color == BROWN }).forEach(::println)

    private fun onlyOneCharly(turtles: List<Turtle>) = (turtles.filter { it.name == "Charly" }).single()

    private fun onlyOneGreen(turtles: List<Turtle>) = (turtles.filter { it.color == GREEN }).single()

    private fun sumAges(turtles: List<Turtle>) = println("The sum of ages is: " + turtles.map { it.age }.sum())
}