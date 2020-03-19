package TemplateMethod

abstract class Template {

	private fun commonMethod1() {
		println("common fun1");
	}

	private fun commonMethod2() {
		println("common fun2");
	}

	abstract protected fun templateMethod1(x: Int, y: Int): Int;

	abstract protected fun templateMethod2(x: Int, y: Int): Int;


	public fun templateMethod(x: Int, y: Int) {
		commonMethod1();
		println(templateMethod1(x, y));
		commonMethod2();
		println(templateMethod2(x, y));
	}
}