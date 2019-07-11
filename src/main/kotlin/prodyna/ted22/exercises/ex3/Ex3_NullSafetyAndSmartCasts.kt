package prodyna.ted22.exercises.ex3

/*
    Nullable Types, Interfaces, SmartCasts

    - Nullable Types are ending with a ? e.g. String? instead of String
    - Use val instead of var for non-mutable attributes (this is the same as final in Java)
    - Create interfaces with the keyword 'interface'. public not needed. Use ':' instead of 'implements' or 'extends'
    - make use of smartcasts as often as possible. A nullable type becomes a non-nullable type after nullcheck,
         a object of type 'Any' is smartcasted to 'String' after an 'is String' check
    - Smart Casts are also working directly after check in same block
        - e.g. var isEmptyString = (object is String && object.length==0)

    Exercise: Modify your turtle programm:

    - Make the description a nullable type (add a ? after String)
    - Add an interface Animal (no methods / attributes needed for this step)
    - Add new data class Cat with attributes 'shortHair: Boolean' and 'name: String'
    - Let Turtle and Cat implement Animal (just use : instead of 'implements' in Java)
    - Add nullable Animal attribute to your Turtle class with name 'friend'.
        - Use val instead of var to make the attribute immutable
        - Adjust your constructors and object creations as needed
    - Create a third turtle with a Cat as friend
    - Create inside of MyTurtleGame a function printFriend with parameter Turtle.
        - Use 'is' Check for Turtle / Cat and printing "Friend is a cat with shortHair = $shortHair" or similar in case of Turtle
        - You have to make a attribute of turtle immutable as well to use smart casts there
        - Remind that you can access properties not in interface without casting the object (smart cast)


 */

fun main() = test("fer")



fun test(s: Any) {
    if(s !is String) return

    println(s.length)
}

interface FooBarInterface {
    fun test(foo: String) = println(foo)
}





