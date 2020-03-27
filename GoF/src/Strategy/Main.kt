package Strategy

fun main(args: Array<String>) {

	var com1: Composition = Composition(Add());
	println(com1.compose(5, 4));
	println(com1.compose(Minus(), 10, 4));

	var com2: Composition = Composition(Multiply());
	println(com2.compose(10, 4));
	println(com2.compose(Divide(), 10, 4));

}