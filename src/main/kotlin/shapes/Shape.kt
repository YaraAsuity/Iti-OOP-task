package shapes

interface Shape {
    fun setDim(vararg dimensions: Double)
     fun getDim(): List<Double>
     fun calcArea(): Double
}