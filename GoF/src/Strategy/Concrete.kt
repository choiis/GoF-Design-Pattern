package Strategy


class Add() : Compositor() {

	override public fun compose(x: Int, y: Int): Int {
		return x + y;
	}
}

class Minus() : Compositor() {

	override public fun compose(x: Int, y: Int): Int {
		return x - y;
	}
}

class Multiply() : Compositor() {

	override public fun compose(x: Int, y: Int): Int {
		return x * y;
	}
}

class Divide() : Compositor() {

	override public fun compose(x: Int, y: Int): Int {
		return x + y;
	}
}