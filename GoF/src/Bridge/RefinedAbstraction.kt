package Bridge

// define constructor once
class RefinedAbstraction(impl: Implementor) : Abstraction(impl) {

	override public fun printAll() {
		impl.printing();
		impl.length();
	}
}