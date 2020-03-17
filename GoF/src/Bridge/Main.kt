package Bridge

fun main(args: Array<String>) {

	var instance: RefinedAbstraction = RefinedAbstraction(ConcreteImplementor1("Hello~"));
	var instance2: RefinedAbstraction = RefinedAbstraction(ConcreteImplementor2("World!!"));

	instance.printAll();
	instance2.printAll();
}