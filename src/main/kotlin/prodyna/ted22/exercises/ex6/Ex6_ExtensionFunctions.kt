package prodyna.ted22.exercises.ex6

/*
    Extension functions, Lambdas with receivers, Operators, Last Parameter as lambda

    - Instead of implement a class like StringUtils with static helper functions, you can use extension functions
        - You can extend every class (String as well). Of course in Java ByteCode, it becomes a static class ;)
        - Syntax is just fun [ClassName].fooBar() instead of fun foobar()
    - +, -, +=, -= are functions as well. You have to use the keyword 'operator' before fun
        - Operator functions have fixed names like 'minus', or 'unaryMinus'
    - Normal function with lambda:
        - fun encloseInXMLAttribute(sb : StringBuilder, attr : String, action : (StringBuilder) -> Unit) : String {
           sb.append("<$attr>")
            action(sb)
            sb.append("</$attr>")
        return sb.toString()

        - if last parameter is a lambda, you can call the method with the lambda outside method parenthesis
            - e.g. encloseInXMLAttribute(StringBuilder(), "title") { it.append("My webpage title" }
    - You can add a receiver to the lambda to omit qualifiers in the function call
        - instead of (StringBuilder) -> Unit, you can use StringBuilder.() -> Unit
        - now, you can omit the 'it' and just write append("My webpage title")

}

    Exercise

    - Implement the operator String extension function for '-object', which returns the string in reversed order
        - e.g., if 'name' is 'Prodyna', '-name' should be 'anydorP'
        - The name of the operator is 'unaryMinus'
    - Implement a string extension function IsPalindrom, which checks, if a string is same in reversed order like 'AnnA'
        - use your new String operator for this
        - Make it case-insensitive, to make the function more useful
    - Implement an extension function hasPalindromName for the turtle class
        - Check if it is working with two different turtles (one with palindrom name, one not)
    - Implement an extension function of Turtle with name 'owner'.
        - Only attribute is a lambda (Human) -> Unit with receiver Human
        - Test the method with: myTurtle.owner{ name = "My new owner" } (if lambda is only parameter, no parenthesis are needed)
        - In case of compile errors like "Val cannot be reassigned" etc. adjust your code as needed

 */

fun main() = MyTurtleGame().createTurtles()

fun String.isEmpty() = this == ""

data class Outer(var outerName: String, var inner: Inner? = null)

data class Inner(var innerName: String = "Default inner name")

fun Outer.inner(block: Inner.() -> Unit) {
    var myInner = Inner()
    block(myInner)
    inner = myInner
}

var myOuter = Outer("MyOuter").inner {
    innerName = "MyInnerName"
}


