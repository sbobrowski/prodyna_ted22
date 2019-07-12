package prodyna.ted22.exercises.ex6

data class Turtle(val color: TurtleColor, var name: String, var age: Int, var description: String?,
                  val friend: Animal?, var owner: Human) : Animal, Greetings by owner {

    init {
        println("Welcome turtle $name!")
    }

    constructor(name: String, friend: Animal?, owner: Human) : this(BROWN, name, 10, "DefaultDescription", friend, owner)

    fun calculateWeight(eatsToMuch : Boolean = false) = (if(eatsToMuch) 1.0 else 1.5) *
            ( (1..Math.min(age, 10)).fold(Constants.START_WEIGHT, { a, b -> a * (1 + (11-b) * 0.05)} ) )


    fun describeColor() = println(
            when(color) {
                is BROWN -> "$name: Yeah, brown like the earth, you cannot see me"
                is BLACK -> "$name: Black like the night. Strangers in the night, lalala"
                is GREEN -> "$name: Green, like the grass I'am eating"
                is MULTI_COLOR -> "$name: Wow, I have ${color.numberOfColor} different colors!"
            }
   )
}
