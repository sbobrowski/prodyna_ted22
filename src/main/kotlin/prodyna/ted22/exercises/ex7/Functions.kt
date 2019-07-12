package prodyna.ted22.exercises.ex7

operator fun String.unaryMinus() = this.reversed()

fun String.isPalindrom() = this.toLowerCase() == -this.toLowerCase()

fun Turtle.hasPalindromName() = this.name.isPalindrom()

fun Turtle.owner(block: Human.() -> Unit) {
    var human = Human()
    block(human)
    owner = human
}