package FactoryMethod

import java.lang.IllegalArgumentException

enum class ShapeSelect {
	Circle,
	Triangle,
	Rectangle,
	Other;
}

class Factory {

	fun create(select: ShapeSelect): Shape {
		when (select) {
			ShapeSelect.Circle -> return Circle();
			ShapeSelect.Triangle -> return Triangle();
			ShapeSelect.Rectangle -> return Rectangle();
			else -> throw IllegalArgumentException();
		}
	}
}