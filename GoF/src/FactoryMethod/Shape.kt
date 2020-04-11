package FactoryMethod

interface Shape {

	fun draw();
}

class Circle : Shape {
	override fun draw() {
		println("Circle");
	}
}
class Triangle : Shape {
	override fun draw() {
		println("Triangle");
	}
}

class Rectangle : Shape {
	override fun draw() {
		println("Rectangle");
	}
}