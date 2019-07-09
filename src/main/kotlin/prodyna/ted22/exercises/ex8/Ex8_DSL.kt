package prodyna.ted22.exercises.ex8

/*
    Exercise:

    Implement a DSL, which allows a creation of a turtle List in this way:

    var myTurtles =
        turtles {
            turtle {
                name = "Sam"
                age = 17
                color = BROWN
            }
            turtle {
                name = "Phil"
                age = 23
                color = GREEN
            } ....
         }

     Hints:

     - You will need Extension functions, lambdas with receivers and last parameter as lambda
     - Scoping functions like apply() will be useful
     - Start with a class Turtles, which extends an ArrayList
     - Implement a function 'turtles' ...
     - You already implemented a extension function Turtle.owner --> This is the way to go.

 */

fun main() = MyTurtleGame().createTurtles()