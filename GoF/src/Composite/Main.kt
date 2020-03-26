package Composite

fun main(args: Array<String>) {

	var c: Component = Composite();
	var c1: Component = Leaf1();
	var c2: Component = Leaf2();
	var c3: Component = Leaf3();

	c.leaf();
	c.add(c1);
	c.add(c2);
	c.add(c3);
	c1.leaf();
	c2.leaf();
	c3.leaf();
	c.leaf();

}