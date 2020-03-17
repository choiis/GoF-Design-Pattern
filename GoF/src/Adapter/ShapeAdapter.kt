package Adapter

class ShapeAdapter : Target {

	// object adapter pattern
	private var adaptee: Adaptee;

	public constructor(adaptee: Adaptee) {
		this.adaptee = adaptee;
	}

	override fun shape() {
		adaptee.adapteeShape();
	}
}