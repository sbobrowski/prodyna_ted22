package prodyna.ted22.exercises.ex7

/*
    Scope functions

	Executing a lambda on non-null objects: let
	Introducing an expression as a variable in local scope: let
	Object configuration: apply
	Object configuration and computing the result: run
	Running statements where an expression is required: non-extension run
	Additional effects: also
	Grouping function calls on an object: with

	also: additional processing on an object in a call chain
	apply: post-construction configuration
	let: conversion of value
	run: execute lambdas with side-effects and no result
	with: configure objects created somewhere else

	inline fun <T, R> with(receiver: T, block: T.() -> R): R {
	    return receiver.block()
	}

	inline fun <T> T.also(block: (T) -> Unit): T {
	    block(this)
	    return this
	}

	inline fun <T> T.apply(block: T.() -> Unit): T {
	    block()
	    return this
	}

	inline fun <T, R> T.let(block: (T) -> R): R {
	    return block(this)
	}

	inline fun <T, R> T.run(block: T.() -> R): R {
	    return block()
	}

    Exercise:

    - Use 4 of the given 5 standard scoping function for following use cases
        - Add more attributes to your Human class with default values. Create owners of some turtles similar
            to the builder pattern
        - Exchange the owners of two turtles!
        - Println a nullable attribute of your turtles. Use one of the scoping functions as a safe call
        - Choose one of your turtles and call multiple functions in a row on it
 */

//fun main() = MyTurtleGame().createTurtles()

fun main() {
    var s = "My Original String"

    s.also {
        println("Original: $it")
        it.reversed()
    }.also {
        println("Reversed: $it")
        it.length
    }.also {
        println("length: $it")
    }

    var x = 5

    println(x.also {x++} * x)
}