package prodyna.ted22.exercises.ex7

sealed class TurtleColor

object BLACK : TurtleColor()
object GREEN : TurtleColor()
object BROWN : TurtleColor()

data class MULTI_COLOR(val numberOfColor: Int) : TurtleColor()