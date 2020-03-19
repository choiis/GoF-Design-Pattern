package Strategy

fun main(args: Array<String>) {

	var com: Composition = Composition(Add());

	println(com.compose(5, 4));
	com.compositor = Minus(); //setter
	println(com.compose(10, 4));
	com.compositor = Multiply(); //setter
	println(com.compose(9, 3));
	com.compositor = Divide(); //setter
	println(com.compose(50, 2));

}