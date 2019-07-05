package prodyna.ted22.exercises.ex5

/*
    Lists, Collections and Ranges

    - To create lists you can use factory methods like listOf(object1, object2, object3)
    - Kotlin distinguishes mutable and immutable collections
        - You cannot add an object to a list created with 'listOf'. Use mutableListOf instead
    - Maps also have factory methods: mapOf(key1 to value1, key2 to value2)
    - You can define ranges, e.g. All numbers from 1 to 100 with 1..100.
        - You can perform forEach and other collection functions on it
    - The collections have the same functions as the Java Stream API
        - Some additional functions like single() are worth a closer look!

    Exercise

    - Create more turtles to have a good basis for the collection api
        - Try to have more than one turtle with the same age / color etc. to train filter operations better
    - Implement a function describeTheColors in MyTurtleGame with a parameter List<Turtle>
        - Function should call describeColor 'forEach' turtle
    - call the function describeTheColors with 'listOf' your turtles
    - Use standard functions known from Java Stream API like filter, map and sum to
        - Print all the turtles with brown color
            (Note: Turtle is a data class, which means it has a fancy toString method already implemented)
        - Sum up the age of all turtles, first use map to map to the age, than use sum()
        - Use additional kotlin function single() to check for exactly one result for a given lambda
    - Modify the calculateWeight function: Weight is START_WEIGHT and grows 50%, 45%, 40% in the first 10 life years
        - You can maintain the eatsToMuch Parameter ;), if you want
        - Use the fold function (same as reduce, but with initial value) on the range (1..age)
        - You can implement the condition 'only first 10 years' in your lambda, or in the range, you decide
 */

fun main() = MyTurtleGame().createTurtles()