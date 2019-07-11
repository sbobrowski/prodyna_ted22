package prodyna.ted22.exercises.ex2

/*
	Classes, Visibility and Init Blocks

 	- Create classes like in Java with "class FooBar" (public is default and not needed)
 	- Create objects without the new keyword. Just use var foobar = FooBar()
 	- Each class can have one primary and 0-x secondary constructors
 	- Full Syntax with primary constructor is: "class FooBar(var attribute1: String, var attribute2: Long)"
 	- Secondary constructors are using the keyword "constructor", keyword can omitted at primary if no annotation is used
 	- data classes are using keyword "data" before "class" and need a primary constructor
 	- no logic at primary constructor allowed, but you can use an init {} Block
	- class attributes as usual with "var/val fooBar: String = "Initial Value"!
 	- no getters / setters needed
 	- customized getters setters possible (with other visibility):
 		var attributeWithSpecialGetterSetter: String
 			get() = otherAttribute.toString()
 			private set(value) { doSomethingDifferent(value) }
 
 		
*/

/*
	Exercise:

	NOTE: In Kotlin you can create multiple public classes in one file. Class must not match the file name

	- Create a data class "Turtle" with attributes color, name, age and description (you need the primary constructor)
	    - Age is Int, the rest is String
	- Add an init block to your data class saying Welcome to the new turtle (use println function)
	- Create a class MyTurtleGame with a function creating two turtles
	- Add an class attribute "config" to MyTurtleGame with initial value and private setter
	- Print the current config in createTurtles function
	- Add an secondary constructor to Turtle only with name, setting other attributes to default values (you must call primary constructor from it)
	- Create a third turtle in createTurtles with the secondary constructor
	- Create a main method (outside the class bodies) calling createTurtles

 */

fun main() = MyTurtleGame().createTurtles()

