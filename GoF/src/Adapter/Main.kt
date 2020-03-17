package Adapter


fun main(args: Array<String>) {

	var target1: Target = Circle();
	target1.shape();

	var target2: Target = Triangle();
	target2.shape();

	var target3: Target = ShapeAdapter(Square());
	target3.shape();
}