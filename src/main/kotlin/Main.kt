import shapes.*

fun main() {
    val rectangle = Rectangle(6.0, 10.0)
    val circle = Circle(3.0)
    val triangle = Triangle(3.0, 6.0)

    val picture = Picture(listOf(rectangle, circle, triangle))
    println("Total area of the picture: ${picture.sumAreas()}")
}