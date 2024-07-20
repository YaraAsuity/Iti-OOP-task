package shapes

class Picture(private val shapes: List<Shape>) {
    fun sumAreas(): Double {
        return shapes.sumOf { it.calcArea() }
    }
}