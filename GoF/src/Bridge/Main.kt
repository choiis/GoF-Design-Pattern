package Bridge

fun main(args: Array<String>) {

	var instance: Abstraction = RefinedAbstraction(ConcreteImplementor1("Hello~"));
	var instance2: Abstraction = RefinedAbstraction(ConcreteImplementor2("World!!"));

	instance.printAll();
	instance2.printAll();
}