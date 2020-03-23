package Decorator

open class Decorator : Component {

	protected var decorator: Component;
	protected var arr: Array<IntArray>?;

	protected constructor(decorator: Component) {
		this.decorator = decorator;
		this.arr = null;
	}

	override fun operation(): Array<IntArray>? {
		return this.arr;
	}
}

class ConcreteDecorator1 : Decorator {

	public constructor(decorator: Component) : super(decorator) {
		super.arr = Array<IntArray>(3, { IntArray(2, { 2 }) });
	}

	override fun operation(): Array<IntArray>? {
		return super.arr;
	}
}

class ConcreteDecorator2 : Decorator {


	public constructor(decorator: Component) : super(decorator) {
		super.arr = Array<IntArray>(4, { IntArray(3, { 1 }) });
	}

	override fun operation(): Array<IntArray>? {
		return super.arr;
	}
}