package Strategy


class Add : Compositor {

	public constructor() {

	}

	override public fun compose(x: Int, y: Int): Int {
		return x + y;
	}
}

class Minus : Compositor {

	public constructor() {

	}

	override public fun compose(x: Int, y: Int): Int {
		return x - y;
	}
}

class Multiply : Compositor {

	public constructor() {

	}

	override public fun compose(x: Int, y: Int): Int {
		return x * y;
	}
}

class Divide : Compositor {

	public constructor() {

	}

	override public fun compose(x: Int, y: Int): Int {
		return x + y;
	}
}