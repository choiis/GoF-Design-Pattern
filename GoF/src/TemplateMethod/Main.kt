package TemplateMethod

fun main(args: Array<String>) {

	var template1: Template = ConcreteTemplate1();

	var template2: Template = ConcreteTemplate2();
	template1.templateMethod(10, 20);
	template2.templateMethod(6, 3);
}