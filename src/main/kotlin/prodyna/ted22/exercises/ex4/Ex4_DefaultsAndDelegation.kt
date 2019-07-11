package prodyna.ted22.exercises.ex4

/*
    Companion objects, Default values, Delegation, Sealed classes, if/when as expression

    - There is no static in Kotlin. Use 'companion object' inside a class
    - Instead of overloading function like in Java you can modify a existing function and add the new attribute with a default value
        - fun printName(name: String) = println("$name") --> fun printName(name: String, prefix: String = "") ...
    - Instead of implement functions of an interface you can delegate to a class attribute of the same interface type (Just use keyword by)
    - if/when are not only control flow, you can use them as expression:
        - e.g. println( if(booleanAttribute) "Yes it's true" else "No, im sorry!" )
        - in such an expression block the last line is used as result of the expression
    - Kotlin has sealed classes as an extension of enums
        - Syntax is sealed class [ClassName] and class/object FooBar : [ClassName]()

    Exercise

    - Create a new class Constants with companion object and constants AGE_WEIGHT_FACTOR and START_WEIGHT (use keywords const val)
        - Use Double values for both
    - implement a function inside Turtle calculateWeight: Int returning START_WEIGHT + age * AGE_WEIGHT_FACTOR
    - refactor your method calculateWeight with an attribute eatsTooMuch with default false.
        - If true multiply the original result with 1.5
    - Delegation training: Create a new interface 'Greetings' and a class 'Human' implementing it.
        - Interface has one method 'greet' with attribute otherName : String
        - 'Human' can be a data class, just with name
        - Refactor Turtle. Each turtle must have a human as owner
        - Turtle also implements 'Greetings', but delegates to its owner
        - you have to refactor your constructors and object creations as well with the new class attribute
    - Implement a sealed class named TurtleColor with BROWN, BLACK, GREEN and MULTI_COLOR. MULTI_COLOR
        - MULTI_COLOR has an additional attribute numberOfColors: Int
    - Refactor the Turtle. The color is now of type TurtleColor..Adjust your code as always
    - Implement a function describeColor, which println a nice text depending of the color
        - use the 'is' keyword and when as an expression to make the function short
        - basic syntax of when is: when(color) { is BROWN ->
        - Remember smart casts! You can access the property numberOfColors directly after 'is'-check
        - Note, that the compiler checks, if you have covered all possible branches of your sealed class
 */

fun main() = MyTurtleGame().createTurtles()

sealed class Status

object OK : Status() {
    fun print() = println("Im OK")
}
object WAITING : Status()

object NOTOK : Status() {
        var why: String = "WHYWHY"

}


class ERROR(var cause: String) : Status()


fun test(status: Status) : String =
    when(status) {
        is OK -> "OK"
        is WAITING -> "Waiting"
        is ERROR -> "${status.cause}"
        else -> ""
    }
