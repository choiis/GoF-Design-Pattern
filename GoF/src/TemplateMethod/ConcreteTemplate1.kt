package TemplateMethod

class ConcreteTemplate1() : Template() {

	override protected fun templateMethod1(x: Int, y: Int): Int {
		return x + y;
	}

	override protected fun templateMethod2(x: Int, y: Int): Int {
		return x - y;
	}
}