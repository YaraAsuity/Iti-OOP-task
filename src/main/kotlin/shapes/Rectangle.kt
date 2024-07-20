package shapes

class Rectangle(private var width: Double = 0.0, private var height: Double = 0.0) : Shape {
    override fun setDim(vararg dimensions: Double) {
        if (dimensions.size >= 2) {
            width = dimensions[0]
            height = dimensions[1]
        }
    }

    override fun getDim(): List<Double> {
        return listOf(width, height)
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    fun getHeight(): Double {
        return height
    }

    override fun calcArea(): Double {
        return width * height
    }
}