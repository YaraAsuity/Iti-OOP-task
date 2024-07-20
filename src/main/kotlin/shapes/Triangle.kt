package shapes

class Triangle(private var base: Double = 0.0, private var height: Double = 0.0) : Shape {
    override fun setDim(vararg dimensions: Double) {
        if (dimensions.size >= 2) {
            base = dimensions[0]
            height = dimensions[1]
        }
    }

    override fun getDim(): List<Double> {
        return listOf(base, height)
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    fun getHeight(): Double {
        return height
    }

    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}