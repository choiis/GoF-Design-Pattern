package FactoryMethod

fun main(args: Array<String>) {

	var factory: Factory = Factory();
	var shape1: Shape = factory.create(ShapeSelect.Circle);
	var shape2: Shape = factory.create(ShapeSelect.Rectangle);
	var shape3: Shape = factory.create(ShapeSelect.Triangle);

	shape1.draw();
	shape2.draw();
	shape3.draw();
	var shape4: Shape = factory.create(ShapeSelect.Other);
}