package Strategy

fun main(args: Array<String>) {

	var com: Composition = Composition(Add());

	println(com.compose(5, 4));
	com.setCompositor(Minus());
	println(com.compose(10, 4));
	com.setCompositor(Multiply());
	println(com.compose(9, 3));
	com.setCompositor(Divide());
	println(com.compose(50, 2));

}