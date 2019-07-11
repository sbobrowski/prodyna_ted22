package prodyna.ted22.exercises.ex4

data class Turtle(val color: TurtleColor, var name: String, var age: Int, var description: String?,
                  val friend: Animal?, val owner: Human) : Animal, Greetings by owner {

    init {
        println("Welcome turtle $name!")
    }

    constructor(name: String, friend: Animal?, owner: Human) : this(BROWN, name, 10, "DefaultDescription", friend, owner)

    fun calculateWeight(eatsToMuch : Boolean = false) =
            (if (eatsToMuch) 1.5 else 1.0) * (Constants.START_WEIGHT + age * Constants.AGE_WEIGHT_FACTOR)

    fun describeColor() = println(
            when(color) {
                is BROWN -> "$name: Yeah, brown like the earth, you cannot see me"
                is BLACK -> "$name: Black like the night. Strangers in the night, lalala"
                is GREEN -> "$name: Green, like the grass I'am eating"
                is MULTI_COLOR -> "$name: Wow, I have ${color.numberOfColor} different colors!"
            }
   )
}
