package prodyna.ted22

fun main() = helloWorldAsExpression()

fun helloWorldWithReturnTypeAndParameter(args : Array<String>) : Unit {
    println("Hello, World With Return Type and Parameter!")
}

fun helloWorldWithReturnType() : Unit {
    println("Hello, World With Return Type!")
}

fun helloWorld() {
    println("Hello, World!")
}

fun helloWorldAsExpression() = println("Hello, World as Expression!")

