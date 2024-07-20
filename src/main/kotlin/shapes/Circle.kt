package shapes

class Circle(private var radius: Double = 0.0) : Shape {
    override fun setDim(vararg dimensions: Double) {
        if (dimensions.isNotEmpty()) {
            radius = dimensions[0]
        }
    }

    override fun getDim(): List<Double> {
        return listOf(radius)
    }

    override fun calcArea(): Double {
        return (22/7) * radius * radius
    }
}