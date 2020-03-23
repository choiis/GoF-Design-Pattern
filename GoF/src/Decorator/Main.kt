package Decorator

fun main(args: Array<String>) {

	val decorator1: Component = ConcreteDecorator1(Component());
	val arr1: Array<IntArray>? = decorator1.operation();

	val decorator2: Component = ConcreteDecorator2(Component());
	val arr2: Array<IntArray>? = decorator2.operation();

	arr1!!.forEach { ar ->
		ar.forEach { it -> print("" + it + " ") }
		println();
	}
	println();
	arr2!!.forEach { ar ->
		ar.forEach { it -> print("" + it + " ") }
		println();
	}
}